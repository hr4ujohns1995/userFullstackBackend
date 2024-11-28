package com.johnscoding.fullstack_backend.controller;

import com.johnscoding.fullstack_backend.exception.UserNotFoundException;
import com.johnscoding.fullstack_backend.model.User;
import com.johnscoding.fullstack_backend.repsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    User addUser(@RequestBody  User user){

        return userRepository.save(user);
    }

    @GetMapping("/getAllUser")
    List<User> getAllUser(){

        return userRepository.findAll();
    }

    @GetMapping("{id}")
    User getUserById(@PathVariable  Long id){

     return userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));
    }

    @PutMapping("/update/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id){

        User user1 = userRepository.findById(id).orElseThrow(()->new UserNotFoundException(id));

        user1.setName(newUser.getName());
        user1.setUserName(newUser.getUserName());
        user1.setEmail(newUser.getEmail());

        return  userRepository.save(user1);
    }

    @DeleteMapping("/delete/{id}")
    String deleteUser(@PathVariable Long id){
        if (!userRepository.existsById(id)){
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);

        return  "user deleted successfully " ;
    }
}
