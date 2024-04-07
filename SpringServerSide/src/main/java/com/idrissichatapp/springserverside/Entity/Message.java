package com.idrissichatapp.springserverside.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Messages")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String Content;
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
