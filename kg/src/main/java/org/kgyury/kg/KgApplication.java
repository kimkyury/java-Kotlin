package org.kgyury.kg;

import lombok.RequiredArgsConstructor;
import org.kgyury.kg.event.RegisterEventPublisher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class KgApplication {

    private final RegisterEventPublisher publisher;

    public static void main(String[] args) {
        SpringApplication.run(KgApplication.class, args);
    }

    public void run(String ...args){
        publisher.register("Kgyury", "mandarining@g.com");
    }
}
