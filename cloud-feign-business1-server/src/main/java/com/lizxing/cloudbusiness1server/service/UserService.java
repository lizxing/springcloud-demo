package com.lizxing.cloudbusiness1server.service;

import com.lizxing.cloudbusiness1server.pojo.User;

/**
 * @author lizxing
 * @date 2020/9/24
 */
public interface UserService {

    User create();
    User getById(int id);
}
