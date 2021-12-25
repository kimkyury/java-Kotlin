import com.sun.xml.internal.ws.developer.UsesJAXBContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMveTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMve;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMveRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMveResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMveResultMatchers.status;

@RunWith(SpringRunner.class) // 테스트 진행시 jUnit에 내장된 실행자 외의 다른 실행자를 실행시킴
@webMvcTest // 여러 스프링 테스트 어노테이션 중, Web에 집중할 수 있는 어노테이션
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
}
