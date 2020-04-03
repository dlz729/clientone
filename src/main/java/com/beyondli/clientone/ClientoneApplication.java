package com.beyondli.clientone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//客户端启动类
public class ClientoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientoneApplication.class, args);
    }

}
