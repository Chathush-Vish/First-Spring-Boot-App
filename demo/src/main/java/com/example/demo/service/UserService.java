package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveUser(UserDto userDto){
        userRepository.save(modelMapper.map(userDto, User.class));
        return userDto;
    }
}
