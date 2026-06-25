package com.jcarlos67.SpringShop_API.resources;

import com.jcarlos67.SpringShop_API.entities.User;
import com.jcarlos67.SpringShop_API.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
  @Autowired
  UserService service;

  @GetMapping
  public ResponseEntity<List<User>> findAll() {
    List<User> userList = service.findAll();
    return ResponseEntity.ok().body(userList);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<User> findById(@PathVariable Long id) {
    return ResponseEntity.ok().body(service.findById(id));
  }

  @PostMapping
  public ResponseEntity<User> insert(@RequestBody User objRequest) {
    User objSaved = service.insert(objRequest);

    URI uri = ServletUriComponentsBuilder.
            fromCurrentRequest().
            path("/{id}").
            buildAndExpand(objSaved.getId()).
            toUri();
    return ResponseEntity.created(uri).body(objSaved);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }


  @PutMapping(value = "/{id}")
  public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
    obj = service.update(id, obj);
    return ResponseEntity.ok().body(obj);
  }
}
