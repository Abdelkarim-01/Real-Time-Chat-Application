package com.idrissichatapp.springserverside.Repositories;

import com.idrissichatapp.springserverside.Entities.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRoomRepo extends JpaRepository<ChatRoom,Long> {

}
