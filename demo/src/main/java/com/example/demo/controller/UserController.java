package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
//    Get users
    @GetMapping("/getUser")
    public String getUser(){
        return "Hello World";
    }

//    Add User
    @PostMapping("/saveUser")
    public String saveUser(){
        return "Hello World";
    }

//    Update user
    @PutMapping("/updateUser")
    public String updateUser(){
        return "Hello World";
    }

//    Delete user
    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "Hello World";
    }

}
