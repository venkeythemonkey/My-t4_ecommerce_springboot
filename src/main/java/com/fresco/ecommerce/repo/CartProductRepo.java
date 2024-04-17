package com.fresco.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fresco.ecommerce.models.CartProduct;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {
}