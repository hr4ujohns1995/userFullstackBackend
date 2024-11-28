package com.johnscoding.fullstack_backend.repsitory;

import com.johnscoding.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
