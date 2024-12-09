package org.kgyury.kg.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class RegisterEvent extends ApplicationEvent {

    private final String username;
    private final String email;

    RegisterEvent(Object source, String username, String email){
        super(source);
        this.username = username;
        this.email = email;
    }
}