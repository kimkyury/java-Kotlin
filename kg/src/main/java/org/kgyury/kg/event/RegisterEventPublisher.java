package org.kgyury.kg.event;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RegisterEventPublisher {

    private final ApplicationEventPublisher publisher;

    public void register(String username, String email){
        log.debug("[EVENT] USER REGISTERED : {}", username);

        RegisterEvent event = new RegisterEvent(this, username, email);
        publisher.publishEvent(event);
    }
}
