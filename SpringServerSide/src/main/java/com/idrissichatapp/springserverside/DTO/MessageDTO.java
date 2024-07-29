package com.idrissichatapp.springserverside.DTO;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class MessageDTO {
    Long id;
    String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    LocalDateTime time;
    Long senderUserId;
    String senderUserName;
    Long receivedUserId;
    String receivedUserName;
    Long chatRoomId;
}
