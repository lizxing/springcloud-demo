package com.lizxing.cloudbusiness2server.service;

import com.lizxing.cloudbusiness2server.fallback.UserTestFallBack;
import com.lizxing.cloudbusiness2server.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lizxing
 * @date 2020/9/24
 */
@FeignClient(value = "feign-business1-server",fallback = UserTestFallBack.class)
public interface UserTestService {

    @GetMapping("/user/create")
    User create();

    @GetMapping("/user/getById")
    User getById(@RequestParam int id);
}
