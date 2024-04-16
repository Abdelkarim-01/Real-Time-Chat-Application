package com.idrissichatapp.springserverside.ServiceImp;

import com.idrissichatapp.springserverside.DTO.MessageDTO;
import com.idrissichatapp.springserverside.Entities.ChatRoom;
import com.idrissichatapp.springserverside.Entities.Message;
import com.idrissichatapp.springserverside.Entities.User;
import com.idrissichatapp.springserverside.Repositories.MessageRepo;
import com.idrissichatapp.springserverside.Services.ChatRoomService;
import com.idrissichatapp.springserverside.Services.MessageService;
import com.idrissichatapp.springserverside.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MessageServiceImp implements MessageService {

    private MessageRepo messageRepo;
    private UserService userService;
    private ChatRoomService chatRoomService;
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

    @Override
    public MessageDTO ToMessageDto(Message message) {
        MessageDTO messageDTO=new MessageDTO();
        messageDTO.setId(message.getId());
        messageDTO.setContent(message.getContent());
        messageDTO.setTime(message.getTime());
        messageDTO.setSenderUserId(message.getSenderUser().getId());
        messageDTO.setReceivedUserId(message.getReceivedUser().getId());
        messageDTO.setChatRoomId(message.getChatRoom().getId());
        return messageDTO;
    }

    @Override
    public Message ToMessageEntity(MessageDTO messageDTO) {
        User senderUser;
        User receivedUser;
        ChatRoom chatRoom;
        Long senderId;
        Long receivedId;
        Long chatRoomId;

        Message message=new Message();
        message.setId(messageDTO.getId());
        message.setContent(messageDTO.getContent());
        message.setTime(messageDTO.getTime());

        senderId=messageDTO.getSenderUserId();
        senderUser = senderId!=null ? userService.findById(senderId) : null;
        message.setSenderUser(senderUser);

        receivedId=messageDTO.getReceivedUserId();
        receivedUser = receivedId!=null ? userService.findById(receivedId) : null;
        message.setReceivedUser(receivedUser);

        chatRoomId=messageDTO.getChatRoomId();
        chatRoom=chatRoomId!=null ? chatRoomService.findById(chatRoomId) : null;
        message.setChatRoom(chatRoom);

        return message;
    }
}
