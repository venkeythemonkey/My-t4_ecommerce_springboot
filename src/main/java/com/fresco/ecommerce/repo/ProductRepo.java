package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fresco.ecommerce.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
}