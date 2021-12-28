package com.kgyury.practice.springboot;
import com.kgyury.practice.springboot.web.dto.HelloResponseDto;

import org.junit.jupiter.api.Test;  // Junit5을 위해 org.junit.Test로부터 대체
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){

        // given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        // then
        assertThat(dto.getName()).isEqualTo(name); // asserThat = 테스트 검증 라이브러리(assertj)의 검증 메소드
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}


