package com.mojja.springeurekasimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringeurekasimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringeurekasimpleApplication.class, args);
    }

}
