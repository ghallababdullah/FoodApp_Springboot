package com.niceandtasty.FoodApp.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.niceandtasty.FoodApp.auth_user.dto.UserDTO;
import com.niceandtasty.FoodApp.enums.OrderStatus;
import com.niceandtasty.FoodApp.enums.PaymentStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDTO {


    private Long id;

    private LocalDateTime orderDate;

    private BigDecimal totalAmount;

    private OrderStatus orderStatus;

    private PaymentStatus paymentStatus;

    private UserDTO user; // Customer who is making/made the order

    private List<OrderItemDTO> orderItems;
}

