package com.lizxing.cloudbusiness2server.controller;

import com.lizxing.cloudbusiness2server.pojo.User;
import com.lizxing.cloudbusiness2server.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author lizxing
 * @date 2020/9/24
 */
@RestController
@RequestMapping("/test/user")
public class UserTestController {

    @Autowired
    UserTestService userTestService;

    @GetMapping("/create")
    public User create() {
        return userTestService.create();
    }

    @GetMapping("/getById")
    public User getById(@RequestParam int id) {
        return userTestService.getById(id);
    }
}
