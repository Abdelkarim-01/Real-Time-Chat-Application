package com.idrissichatapp.springserverside.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "chatRooms")
@Data @NoArgsConstructor @AllArgsConstructor
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String roomName;
    String roomDescription;

    @OneToMany(mappedBy = "chatRoom")
    List<ChatRoomMembership> chatRoomMemberships;
}
