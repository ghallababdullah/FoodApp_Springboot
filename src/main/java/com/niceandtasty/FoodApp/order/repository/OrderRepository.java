package com.niceandtasty.FoodApp.order.repository;

import com.niceandtasty.FoodApp.auth_user.entity.User;
import com.niceandtasty.FoodApp.enums.OrderStatus;
import com.niceandtasty.FoodApp.order.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order , Long> {

    Page<Order> findByOrderStatus(OrderStatus orderStatus , Pageable pageable) ;

    List<Order> findByUserOrderByOrderDataDesc(User user) ;

    @Query("SELECT COUNT(DISTINCT o.user.id) FROM Order o ")
    long countDistinctUsers() ;

}
