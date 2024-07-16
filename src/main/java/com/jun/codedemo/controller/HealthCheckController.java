package com.jun.codedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jun
 * @date 2024/7/16 19:13
 */
@RestController
public class HealthCheckController {

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "app is running";
    }
}
