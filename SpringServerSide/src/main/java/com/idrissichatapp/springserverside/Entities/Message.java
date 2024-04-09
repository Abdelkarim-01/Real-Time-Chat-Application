package com.idrissichatapp.springserverside.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Messages")
@Data @NoArgsConstructor @AllArgsConstructor
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String content;
    LocalDateTime time;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "senderUser_id")
    User senderUser;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "receivedUser_id")
    User receivedUser;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chatRoom_id")
    ChatRoom chatRoom;
}
