package com.example.test1Spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @GetMapping("/getUser")
    public String getUser() {
        return "Hey Udesh !!!";
    }
    @PostMapping("/createUser")
    public String createUser() {
        return "User has been created successfully...";
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "User has been updated successfully...";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User has been deleted successfully...";
    }
}
