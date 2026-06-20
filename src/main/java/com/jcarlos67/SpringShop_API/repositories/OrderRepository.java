package com.jcarlos67.SpringShop_API.repositories;

import com.jcarlos67.SpringShop_API.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
