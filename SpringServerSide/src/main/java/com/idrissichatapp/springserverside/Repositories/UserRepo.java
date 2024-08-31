package com.idrissichatapp.springserverside.Repositories;

import com.idrissichatapp.springserverside.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    public Optional<User> findUserByEmail(String email);
}
