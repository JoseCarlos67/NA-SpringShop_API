package com.jcarlos67.SpringShop_API.resources;

import com.jcarlos67.SpringShop_API.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

  @GetMapping
  public ResponseEntity<User> findAll() {
    User user = new User("Maria", "maria@gmail.com", "9999999", "232132");
    return ResponseEntity.ok().body(user);
  }
}
