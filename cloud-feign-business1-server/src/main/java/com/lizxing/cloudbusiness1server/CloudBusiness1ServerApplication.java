package com.lizxing.cloudbusiness1server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
public class CloudBusiness1ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudBusiness1ServerApplication.class, args);
    }

}
