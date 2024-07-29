package com.idrissichatapp.springserverside.Services;

import com.idrissichatapp.springserverside.Entities.ChatRoom;

public interface ChatRoomService {
    ChatRoom findById(Long id);
    ChatRoom saveChatRoom(ChatRoom chatRoom);
    void deleteChatRoom(Long chatRoomId);
}
