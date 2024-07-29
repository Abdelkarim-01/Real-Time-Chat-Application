package com.idrissichatapp.springserverside.DTO;

import com.idrissichatapp.springserverside.Entities.ChatRoom;
import com.idrissichatapp.springserverside.Entities.Enum.Status;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class UserDTO {
    Long id;
    String username;
    String firstName;
    String lastName;
    LocalDateTime lastSeen;
    Status status;
}
