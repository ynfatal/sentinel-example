package com.example.controller;

import com.example.feign.IProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fatal
 * @date 2020/7/28 8:39
 */
@RestController
public class ConsumerController {

    @Autowired
    private IProviderClient providerClient;

    /**
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
       return providerClient.hello("fatal");
    }

}
