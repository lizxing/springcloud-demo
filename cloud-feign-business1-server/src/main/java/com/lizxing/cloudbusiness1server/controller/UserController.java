package com.lizxing.cloudbusiness1server.controller;

import com.lizxing.cloudbusiness1server.pojo.User;
import com.lizxing.cloudbusiness1server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lizxing
 * @date 2020/9/24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/create")
    public User create() {
        return userService.create();
    }

    @GetMapping("/getById")
    public User getById(@RequestParam int id) {
        return userService.getById(id);
    }
}

