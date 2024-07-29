package com.idrissichatapp.springserverside.Controllers;

import com.idrissichatapp.springserverside.Entities.ChatRoom;
import com.idrissichatapp.springserverside.Services.ChatRoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/chatRoom")
public class ChatRoomController {
    private ChatRoomService chatRoomService;

    @PostMapping("/save")
    ChatRoom saveChatRoom(@RequestBody ChatRoom chatRoom){
        return chatRoomService.saveChatRoom(chatRoom);
    }

    @GetMapping("/findById/{id}")
    ChatRoom findById(@PathVariable Long id){
        return chatRoomService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    void deleteChatRoom(@PathVariable Long id){
       chatRoomService.deleteChatRoom(id);
    }
}
