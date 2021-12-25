package com.kyu.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.admin.SpringBootApplication;

@SpringBootApplication // 스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동 설정, 항상 프로젝트 최상단에 위치할 것.
public class Application {  //앞으로 진행될 프로젝트의 메인 클래스
    public static void main(String [] args){
        SpringApplication.run(Appllication.class, args); //내장 was(Web Application Server)실행
    }
}
