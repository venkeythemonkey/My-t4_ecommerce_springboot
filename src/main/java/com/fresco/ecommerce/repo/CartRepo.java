package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fresco.ecommerce.models.Cart;

@Repository
public interface CartRepo extends JpaRepository<Cart, Integer> {
}