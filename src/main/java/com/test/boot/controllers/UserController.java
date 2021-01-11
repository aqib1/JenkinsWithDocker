package com.test.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController("/users")
public class UserController {

    @GetMapping
    public List<String> getUsers() {
        return Arrays.asList("Aqib","Ali", "Ahmad");
    }
}
