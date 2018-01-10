package com.itmuch.cloud.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.itmuch.cloud.study.entity.User;
import com.itmuch.cloud.study.repository.UserRepository;

@RestController
@RequestMapping(value = "/user")
public class UserController {
  @Autowired
  private UserRepository userRepository;

  @GetMapping("/{id}")
  public User findById(@PathVariable Long id) {
    User findOne = this.userRepository.findOne(id);
    return findOne;
  }

  @GetMapping("/get")
  public User get(User user) {
    return user;
  }

  @PostMapping("/post")
  public User post(@RequestBody User user) {
    return user;
  }
}
