package com.loongstudio.gradle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author KunLong-Luo
 * @version 1.0.0
 * @since 2023/8/21 8:10
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello world!";
    }
}
