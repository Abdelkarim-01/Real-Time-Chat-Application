package com.idrissichatapp.springserverside.Entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "ChatRooms")
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
