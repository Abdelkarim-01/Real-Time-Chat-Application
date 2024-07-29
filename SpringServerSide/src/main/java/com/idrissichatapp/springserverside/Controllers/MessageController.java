package com.idrissichatapp.springserverside.Controllers;

import com.idrissichatapp.springserverside.Entities.Message;
import com.idrissichatapp.springserverside.Services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/message")
public class MessageController {
    private MessageService messageService;

    @GetMapping("/conversation/{senderId}/{receivedId}")
    List<Message> getConversationMessages(@PathVariable Long senderId, @PathVariable Long receivedId ){
        return messageService.findMessagesRelatedToConversation(senderId,receivedId);
    }
    @GetMapping("/chatRoom/{chatRoomId}")
    List<Message> getChatRoomMessages(@PathVariable Long chatRoomId){
        return messageService.findMessagesRelatedToChatRoom(chatRoomId);
    }
}
