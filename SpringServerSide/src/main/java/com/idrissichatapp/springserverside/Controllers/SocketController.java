package com.idrissichatapp.springserverside.Controllers;

import com.idrissichatapp.springserverside.DTO.MessageDTO;
import com.idrissichatapp.springserverside.Entities.Message;
import com.idrissichatapp.springserverside.Services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class SocketController {

    private SimpMessagingTemplate messagingTemplate;
    private MessageService messageService;
    @MessageMapping("/app/conversation")
    void sendMessagePrivate(@Payload MessageDTO messageDTO) {
        Message message = messageService.ToMessageEntity(messageDTO);
        message = messageService.saveMessage(message);
        messageDTO.setId(message.getId());
        try {
            messagingTemplate.convertAndSend("/conversation/" + messageDTO.getReceivedUserId() + "/private", messageDTO);
        } catch (Exception e) {
            // Handle error sending message (e.g., log the error)
        }
    }

    @MessageMapping("/app/group")
    void sendMessageRoom(@Payload MessageDTO messageDTO) {
        Message message = messageService.ToMessageEntity(messageDTO);
        message = messageService.saveMessage(message);
        messageDTO.setId(message.getId());
        try {
            messagingTemplate.convertAndSend("/group/" + messageDTO.getChatRoomId() , messageDTO);
        } catch (Exception e) {
            // Handle error sending message (e.g., log the error)
        }
    }
}

