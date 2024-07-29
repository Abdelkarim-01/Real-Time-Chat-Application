package com.idrissichatapp.springserverside.DTO;

import com.idrissichatapp.springserverside.Entities.Enum.Type;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class ChatRoomMembershipDTO {
    Long id;
    Long chatRoomId;
    UserDTO userDTO;
    Type type;
    LocalDateTime dateJoined;
}