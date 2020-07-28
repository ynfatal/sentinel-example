package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fatal
 * @date 2020/7/28 7:59
 */
@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return String.format("Hello, %s!", name);
    }

}
