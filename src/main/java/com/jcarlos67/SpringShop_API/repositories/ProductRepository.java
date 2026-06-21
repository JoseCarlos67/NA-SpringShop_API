package com.jcarlos67.SpringShop_API.repositories;

import com.jcarlos67.SpringShop_API.entities.Product;
import com.jcarlos67.SpringShop_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
