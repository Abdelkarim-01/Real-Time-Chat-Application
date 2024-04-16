package com.idrissichatapp.springserverside.Services;

import com.idrissichatapp.springserverside.DTO.UserDTO;
import com.idrissichatapp.springserverside.Entities.User;

public interface UserService {
    User findById(Long id);
    User saveUser(User user);
    void DeleteUserById(Long id);

//    UserDTO toUserDT(User user);
//    User toUserEntity(UserDTO userDTO);
}
