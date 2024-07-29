package com.idrissichatapp.springserverside.Services;

import com.idrissichatapp.springserverside.DTO.MessageDTO;
import com.idrissichatapp.springserverside.Entities.Message;

import java.util.List;

public interface MessageService {
    Message saveMessage(Message message);
    void deleteMessage(Long messageId);
    List<Message> findMessagesRelatedToConversation(Long senderId,Long receivedId);
    List<Message> findMessagesRelatedToChatRoom(Long ChatRoomId);
    MessageDTO ToMessageDto(Message message);
    Message ToMessageEntity(MessageDTO messageDTO);
}
