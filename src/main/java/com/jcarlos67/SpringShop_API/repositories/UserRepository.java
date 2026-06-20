package com.jcarlos67.SpringShop_API.repositories;

import com.jcarlos67.SpringShop_API.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
