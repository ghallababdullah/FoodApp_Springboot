package com.niceandtasty.FoodApp.order.repository;

import com.niceandtasty.FoodApp.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
