package com.springbootentryfiles;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootbeanfiles.User8;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody User8 user) {
        return "User created: " + user.getFirstName() + " " + user.getLastName() + ", Age: " + user.getAge();
    }
}