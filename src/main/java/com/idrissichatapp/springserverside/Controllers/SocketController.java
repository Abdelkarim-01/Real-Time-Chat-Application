package com.idrissichatapp.springserverside.Controllers;

import com.idrissichatapp.springserverside.DTO.MessageDTO;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class SocketController {

    @MessageMapping("/conversation/")
    void sendMessagePrivate(@Payload MessageDTO messageDTO){

    }
}
