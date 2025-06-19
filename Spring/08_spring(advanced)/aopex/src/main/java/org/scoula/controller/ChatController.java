package org.scoula.controller;

import lombok.extern.log4j.Log4j2;
import org.scoula.domain.ChatMessage;
import org.scoula.domain.GreetingMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@Log4j2
public class ChatController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public GreetingMessage greeting(GreetingMessage greetingMessage) throws Exception {
        log.info("greetingMessage: " + greetingMessage);
        return greetingMessage;
    }

    @MessageMapping("/chat")
    @SendTo("/topic/chat")
    public ChatMessage chat(ChatMessage chatMessage) throws Exception {
        log.info("chat received: " + chatMessage);
        return chatMessage;
    }
}
