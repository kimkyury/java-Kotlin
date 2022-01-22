package com.kgryury.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class kgyuryApplication {

    @GetMapping("/access")
    public String accessVertify(){
        return "넌 와두 돼";
    }

    public static void main(String[] args){

        SpringApplication.run(kgyuryApplication.class, args);
    }
}
