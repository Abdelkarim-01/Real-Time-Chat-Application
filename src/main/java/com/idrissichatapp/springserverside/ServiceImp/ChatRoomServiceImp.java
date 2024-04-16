package com.idrissichatapp.springserverside.ServiceImp;

import com.idrissichatapp.springserverside.Entities.ChatRoom;
import com.idrissichatapp.springserverside.Entities.User;
import com.idrissichatapp.springserverside.Repositories.ChatRoomRepo;
import com.idrissichatapp.springserverside.Services.ChatRoomService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ChatRoomServiceImp implements ChatRoomService {
    private ChatRoomRepo chatRoomRepo;

    @Override
    public ChatRoom findById(Long id) {
        Optional<ChatRoom> optionalChatRoom=chatRoomRepo.findById(id);
        return optionalChatRoom.orElse(null);
    }

    @Override
    public ChatRoom saveChatRoom(ChatRoom chatRoom) {
        return chatRoomRepo.save(chatRoom);
    }

    @Override
    public void deleteChatRoom(Long chatRoomId) {
        chatRoomRepo.deleteById(chatRoomId);
    }
}
