package com.idrissichatapp.springserverside.ServiceImp;

import com.idrissichatapp.springserverside.Entities.ChatRoom;
import com.idrissichatapp.springserverside.Repositories.ChatRoomRepo;
import com.idrissichatapp.springserverside.Services.ChatRoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ChatRoomServiceImp implements ChatRoomService {
    private ChatRoomRepo chatRoomRepo;

    @Override
    public ChatRoom saveChatRoom(ChatRoom chatRoom) {
        return chatRoomRepo.save(chatRoom);
    }

    @Override
    public void deleteChatRoom(Long chatRoomId) {
        chatRoomRepo.deleteById(chatRoomId);
    }
}
