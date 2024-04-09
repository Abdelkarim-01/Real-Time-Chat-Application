package com.idrissichatapp.springserverside.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity
@Table(name = "ChatRooms")
@Data @NoArgsConstructor @AllArgsConstructor
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String roomName;
    @ManyToMany
    @JoinTable(
            name = "user_romms",
            joinColumns = @JoinColumn(name = "room_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    List<User> normalUsers;
    @ManyToMany
    @JoinTable(
            name = "admin_romms",
            joinColumns = @JoinColumn(name = "room_id"),
            inverseJoinColumns = @JoinColumn(name = "admin_id"))
    List<User> adminsUsers;
}
