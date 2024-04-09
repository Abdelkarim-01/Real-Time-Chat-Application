package com.idrissichatapp.springserverside.ServiceImp;

import com.idrissichatapp.springserverside.Entities.User;
import com.idrissichatapp.springserverside.Repositories.UserRepo;
import com.idrissichatapp.springserverside.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImp implements UserService {
    private UserRepo userRepo;
    @Override
    public User findById(Long id) {
        Optional<User> optionalUser=userRepo.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void DeleteUserById(Long id) {
        userRepo.deleteById(id);
    }
}
