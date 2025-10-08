package com.niceandtasty.FoodApp.payment.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.niceandtasty.FoodApp.auth_user.dto.UserDTO;
import com.niceandtasty.FoodApp.enums.PaymentGateway;
import com.niceandtasty.FoodApp.enums.PaymentStatus;
import com.niceandtasty.FoodApp.order.dto.OrderDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {
    private Long id;

    private Long orderId;

    private BigDecimal amount;

    private PaymentStatus paymentStatus;

    private String transactionId;

    private PaymentGateway paymentGateway;

    private String failureReason;

    private boolean success;

    private LocalDateTime paymentDate;

    private OrderDTO order;
    private UserDTO user;
}
