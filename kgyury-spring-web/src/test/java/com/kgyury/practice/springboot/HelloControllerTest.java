package com.kgyury.practice.springboot;

import org.junit.jupiter.api.Test;  // 1. Junit5을 위해 org.junit.Test로부터 대체
import org.junit.jupiter.api.extension.ExtendWith; // 1. Junit5를 위해 runner.RunWith로부터 대체

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension; // 1. junit5를 위해 junit4.SpringRunner로부터 대체
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is; // 2. 추가
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath; // 2.추가
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

    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                        get("/hello/dto")
                                .param("name", name)
                                .param("amount", String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount", is(amount)));
    }
}
