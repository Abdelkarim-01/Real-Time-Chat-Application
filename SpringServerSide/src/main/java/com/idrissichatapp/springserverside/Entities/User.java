package com.idrissichatapp.springserverside.Entities;

import com.idrissichatapp.springserverside.Entities.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
@Data @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String username;
    String firstName;
    String lastName;
    LocalDateTime lastSeen;
    @Enumerated(EnumType.STRING)
    Status status;
    @OneToMany(mappedBy = "user")
    List<ChatRoomMembership> chatRoomMemberships;
}
