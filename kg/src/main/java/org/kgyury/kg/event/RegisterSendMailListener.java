package org.kgyury.kg.event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RegisterSendMailListener {

    @EventListener
    public void handleRegisterEvent(RegisterEvent event){
      log.info("[EVENT LISTENER2] SEND EMAIL: {}", event.getEmail());
    }
}
