package com.jcarlos67.SpringShop_API.services;

import com.jcarlos67.SpringShop_API.entities.User;
import com.jcarlos67.SpringShop_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  @Autowired
  private UserRepository repository;

  public List<User> findAll() {
    return repository.findAll();
  }

  public User findById(Long id) {
    Optional<User> object = repository.findById(id);
    return object.get();
  }

  public User insert(User obj) {
    return repository.save(obj);
  }

  public void delete(Long id) {
    repository.deleteById(id);
  }

  public User update(Long id, User objRequest) {
    User entity = repository.getReferenceById(id);
    updateDate(entity, objRequest);
    return repository.save(entity);
  }

  private void updateDate(User entity, User objRequest) {
    entity.setName(objRequest.getName());
    entity.setEmail(objRequest.getEmail());
    entity.setPhone(objRequest.getPhone());
  }
}
