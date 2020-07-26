package com.example;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SentinelIntegrateExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelIntegrateExampleApplication.class, args);
    }

    @Service
    public class TestService {

        @SentinelResource("sayHello")
        public String sayHello(String name) {
            return "Hello, " + name;
        }

    }

    @RestController
    public class TestController {

        @Autowired
        private TestService service;

        @GetMapping("/hello/{name}")
        public String apiHello(@PathVariable String name) {
            return service.sayHello(name);
        }
    }
}
