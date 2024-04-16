package com.idrissichatapp.springserverside.DTO;

import com.idrissichatapp.springserverside.Entities.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
public class ChatRoomDTO {
    Long id;
    String roomName;
    List<User> normalUsers;
    List<User> adminsUsers;
}
