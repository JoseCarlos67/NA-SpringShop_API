package com.jcarlos67.SpringShop_API.resources;

import com.jcarlos67.SpringShop_API.entities.Order;
import com.jcarlos67.SpringShop_API.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
  @Autowired
  OrderService OrderService;

  @GetMapping
  public ResponseEntity<List<Order>> findAll() {
    List<Order> OrderList = OrderService.findAll();
    return ResponseEntity.ok().body(OrderList);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Order> findById(@PathVariable Long id) {
    return ResponseEntity.ok().body(OrderService.findById(id));
  }
}