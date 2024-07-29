package com.idrissichatapp.springserverside.Repositories;

import com.idrissichatapp.springserverside.Entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MessageRepo extends JpaRepository<Message,Long> {
    @Query("SELECT m FROM Message m WHERE m.senderUser.id = :senderId AND m.receivedUser.id = :receivedId ORDER BY m.time ASC")
    List<Message> findMessagesRelatedToConversation(Long senderId, Long receivedId);
    @Query("SELECT m FROM Message m WHERE m.chatRoom.id = :chatRoomId ORDER BY m.time ASC")
    List<Message> findMessagesRelatedToChatRoom(Long chatRoomId);
    @Override
    Message getReferenceById(Long aLong);
}
