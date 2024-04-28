package com.atis.zadanie1.UserController;

import com.atis.zadanie1.Etnity.User;
import com.atis.zadanie1.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // dopisz odpowiednią adnotacje endpointu post, która pozwoli tej metodzie
    // zapisywać dane do bazy danych
    public void createUser(@RequestBody User user) {
        userService.saveUser(user);
    }
}
