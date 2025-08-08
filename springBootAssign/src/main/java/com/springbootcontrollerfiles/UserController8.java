package com.springbootcontrollerfiles;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbeanfiles.User8;

@RestController
@RequestMapping("/users")
public class UserController8 {

    @PostMapping
    public String createUser(@RequestBody String user) {
        return user;
    }
}
