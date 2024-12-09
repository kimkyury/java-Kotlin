package org.kgyury.kg;

import lombok.RequiredArgsConstructor;
import org.kgyury.kg.event.RegisterEventPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class KgApplication implements CommandLineRunner {

    private final RegisterEventPublisher publisher;

    public static void main(String[] args) {
        System.out.println("------main-----");
        SpringApplication.run(KgApplication.class, args);
    }

    @Override
    public void run(String ...args){
        System.out.println("-------run------");
        publisher.register("Kgyury", "mandarining@g.com");
    }
}
