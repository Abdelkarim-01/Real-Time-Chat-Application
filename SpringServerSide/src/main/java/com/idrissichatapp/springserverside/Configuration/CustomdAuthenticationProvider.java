package com.idrissichatapp.springserverside.Configuration;

import com.idrissichatapp.springserverside.Entities.User;
import com.idrissichatapp.springserverside.Repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component @AllArgsConstructor
public class CustomdAuthenticationProvider implements AuthenticationProvider {

    private UserRepo userRepo;
    private PasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String email = authentication.getName();
        String pwd = authentication.getCredentials().toString();
        Optional<User> user = userRepo.findUserByEmail(email);
        if (user.isPresent()) {
            if (passwordEncoder.matches(pwd, user.get().getPassword())) {
                return new UsernamePasswordAuthenticationToken(email, pwd , Collections.emptyList());
            } else {
                throw new BadCredentialsException("Invalid password!");
            }
        }else {
            throw new BadCredentialsException("No user registered with this details!");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
}
