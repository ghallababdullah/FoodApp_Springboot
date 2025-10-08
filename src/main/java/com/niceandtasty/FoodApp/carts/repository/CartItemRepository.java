package com.niceandtasty.FoodApp.carts.repository;

import com.niceandtasty.FoodApp.carts.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CartItemRepository extends JpaRepository<CartItem , Long> {

    @Override
    Optional<CartItem> findById(Long aLong);
}
