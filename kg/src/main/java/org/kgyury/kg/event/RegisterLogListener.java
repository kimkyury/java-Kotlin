package org.kgyury.kg.event;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RegisterLogListener {

    @Async
    @EventListener
    public void handleRegisterEvent(RegisterEvent event){
      log.info("[EVENT LISTENER1] Registered Someone : {}", event.getUsername());
      log.info("[EVENT THREAD] Listener executed on thread: {}" , Thread.currentThread().getName());
    }
}
