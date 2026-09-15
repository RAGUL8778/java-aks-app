package com.example.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to AKS Demo Application";
    }

    @GetMapping("/load")
    public String loadTest() {
        return "Application Running Successfully";
    }
}
