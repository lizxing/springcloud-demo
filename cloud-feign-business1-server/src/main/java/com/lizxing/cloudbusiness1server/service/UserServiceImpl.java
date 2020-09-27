package com.lizxing.cloudbusiness1server.service;

import com.lizxing.cloudbusiness1server.pojo.User;
import org.springframework.stereotype.Service;

/**
 * @author lizxing
 * @date 2020/9/24
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public User create() {
        return new User(1,"xiaoming", "男", 10);
    }

    @Override
    public User getById(int id) {
        return new User(id,"xiaoming", "男", 10);
    }
}
