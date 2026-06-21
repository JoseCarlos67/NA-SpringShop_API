package com.jcarlos67.SpringShop_API.services;

import com.jcarlos67.SpringShop_API.entities.Product;
import com.jcarlos67.SpringShop_API.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
  @Autowired
  private ProductRepository repository;

  public List<Product> findAll() {
    return repository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> object = repository.findById(id);
    return object.get();
  }
}
