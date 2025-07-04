package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<UserDto> getAllUsers(){
        List<User> userList =userRepository.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDto>>(){}.getType());
    }

    public UserDto updateUser(UserDto userDto){
        userRepository.save(modelMapper.map(userDto, User.class));
        return userDto;
    }

    public boolean deleteUser(UserDto userDto){
        userRepository.delete(modelMapper.map(userDto, User.class));
        return true;
    }

    public UserDto getUserById(String userId){
        User user =  userRepository.getUserById(userId);
        return modelMapper.map(user, UserDto.class);
    }
}
