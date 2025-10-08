package com.niceandtasty.FoodApp.carts.repository;

import com.niceandtasty.FoodApp.carts.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartRepository extends JpaRepository<Cart , Long> {


    Optional<Cart> findByUser_Id(Long userId);


}
