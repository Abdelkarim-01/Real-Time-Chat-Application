package com.idrissichatapp.springserverside.Services;

import com.idrissichatapp.springserverside.Entities.User;

public interface UserService {
    User findById(Long id);
    User saveUser(User user);
    void DeleteUserById(Long id);

}
