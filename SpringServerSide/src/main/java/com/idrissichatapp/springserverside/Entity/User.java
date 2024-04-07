package com.idrissichatapp.springserverside.Entity;

import com.idrissichatapp.springserverside.Entity.Enum.Status;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Users")
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
    @ManyToMany(mappedBy = "normalUsers")
    List<ChatRoom> chatroomUser;
    @ManyToMany(mappedBy = "adminsUsers")
    List<ChatRoom> chatroomAdmin;

}
