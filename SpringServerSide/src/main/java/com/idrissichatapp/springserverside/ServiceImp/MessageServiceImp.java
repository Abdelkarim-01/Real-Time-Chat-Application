package com.idrissichatapp.springserverside.ServiceImp;

import com.idrissichatapp.springserverside.Entities.Message;
import com.idrissichatapp.springserverside.Repositories.MessageRepo;
import com.idrissichatapp.springserverside.Services.MessageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageServiceImp implements MessageService {

    private MessageRepo messageRepo;
    @Override
    public Message saveMessage(Message message) {
        return messageRepo.save(message);
    }

    @Override
    public void deleteMessage(Long messageId) {
        messageRepo.deleteById(messageId);
    }

    @Override
    public List<Message> findMessagesRelatedToConversation(Long senderId, Long receivedId) {
        return messageRepo.findMessagesRelatedToConversation(senderId,receivedId);
    }

    @Override
    public List<Message> findMessagesRelatedToChatRoom(Long ChatRoomId) {
        return messageRepo.findMessagesRelatedToChatRoom(ChatRoomId);
    }
}
