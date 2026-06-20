package com.jcarlos67.SpringShop_API.config;

import com.jcarlos67.SpringShop_API.entities.Order;
import com.jcarlos67.SpringShop_API.entities.User;
import com.jcarlos67.SpringShop_API.repositories.OrderRepository;
import com.jcarlos67.SpringShop_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository orderRepository;

  @Override
  public void run(String... args) throws Exception {
    User user1 = new User("Maria Brown", "maria@gmail.com", "99999999", "2432423");
    User user2 = new User("Larissa B.", "larissa@gmail.com", "9999999", "34893082904");

    Order order1 = new Order(Instant.parse("2025-06-20T19:45:08Z"), user1);
    Order order2 = new Order(Instant.parse("2025-06-20T09:10:45Z"), user2);

    userRepository.saveAll(Arrays.asList(user1, user2));
    orderRepository.saveAll(Arrays.asList(order1, order2));
  }
}
