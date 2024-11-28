package com.johnscoding.fullstack_backend.exception;

public class UserNotFoundException extends  RuntimeException{

    public UserNotFoundException(Long id){
    super("user not found with this id "+ id);
    }
}
