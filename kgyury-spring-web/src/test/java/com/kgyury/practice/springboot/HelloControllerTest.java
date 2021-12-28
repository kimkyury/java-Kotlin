package com.kgyury.practice.springboot;

import org.junit.jupiter.api.Test;  // Junit5을 위해 org.junit.Test로부터 대체
import org.junit.jupiter.api.extension.ExtendWith; // Junit5를 위해 runner.RunWith로부터 대체

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension; // junit5를 위해 junit4.SpringRunner로부터 대체
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)  //Junit5을 위해 Runwith, SpringRunner로부터 대체
@WebMvcTest
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
