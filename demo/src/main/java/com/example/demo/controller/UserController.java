package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

//    Get users
    @GetMapping("/getUser")
    public String getUser(){
        return "Hello World";
    }

//    Add User
    @PostMapping("/saveUser")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.saveUser(userDto);
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
