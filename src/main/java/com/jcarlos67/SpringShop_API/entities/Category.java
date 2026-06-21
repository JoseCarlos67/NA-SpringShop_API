package com.jcarlos67.SpringShop_API.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @JsonIgnore
  @ManyToMany(mappedBy = "categories")
  private Set<Product> products = new HashSet<>();

  public Category() {
  }

  public Category(String name) {
    id = null;
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Product> getProducts() {
    return products;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Category category = (Category) o;
    return Objects.equals(getId(), category.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(getId());
  }
}
