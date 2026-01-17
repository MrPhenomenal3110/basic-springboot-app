package com.example.basicspringbootapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Controller for greeting endpoints.
 */
@RestController
@RequestMapping("/greetings")
public class GreetingController {

    /**
     * Returns a greeting message.
     *
     * @return ResponseEntity containing a greeting message
     */
    @GetMapping
    public ResponseEntity<Map<String, String>> getGreeting() {
        return ResponseEntity.ok(Map.of("message", "Hello from Spring Boot"));
    }
}
