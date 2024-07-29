package com.idrissichatapp.springserverside.Entities;

import com.idrissichatapp.springserverside.Entities.Enum.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "chatroom_membership")
@Data @NoArgsConstructor @AllArgsConstructor
public class ChatRoomMembership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "chatRoom_id")
    ChatRoom chatRoom;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @Enumerated(EnumType.STRING)
    Type type;

    LocalDateTime dateJoined;
}
