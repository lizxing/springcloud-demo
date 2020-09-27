package com.lizxing.cloudbusiness2server.fallback;

import com.lizxing.cloudbusiness2server.pojo.User;
import com.lizxing.cloudbusiness2server.service.UserTestService;
import org.springframework.stereotype.Service;

/**
 * @author lizxing
 * @date 2020/9/25
 */
@Service
public class UserTestFallBack implements UserTestService {
    @Override
    public User create() {
        return new User(-1, "这是默认用户", "无", -1);
    }

    @Override
    public User getById(int id) {
        return new User(-1, "这是默认用户", "无", -1);
    }
}
