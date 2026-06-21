package com.jcarlos67.SpringShop_API.repositories;

import com.jcarlos67.SpringShop_API.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
