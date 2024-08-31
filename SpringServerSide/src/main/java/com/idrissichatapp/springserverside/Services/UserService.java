package com.idrissichatapp.springserverside.Services;

import com.idrissichatapp.springserverside.DTO.UserDTO;
import com.idrissichatapp.springserverside.Entities.User;

import java.util.Optional;

public interface UserService {
    User findById(Long id);
    User saveUser(User user);
    void DeleteUserById(Long id);
    public Optional<User> findUserByEmail(String email);

//    UserDTO toUserDT(User user);
//    User toUserEntity(UserDTO userDTO);
}
