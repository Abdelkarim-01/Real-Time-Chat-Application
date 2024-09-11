package com.idrissichatapp.springserverside.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {

    @GetMapping("/user")
    public String Login(Authentication authentication){
        return "hello";
    }
    @PostMapping("/test")
    public String test( ){
        return "hello fom protected resources ";
    }


}
