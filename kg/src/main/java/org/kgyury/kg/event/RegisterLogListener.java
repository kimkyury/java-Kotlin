package org.kgyury.kg.event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RegisterLogListener {

    @EventListener
    public void handleRegisterEvent(RegisterEvent event){
      log.debug("[EVENT] Registered Someone : {}", event.getUsername());
    }
}
