package com.niceandtasty.FoodApp.order.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import com.niceandtasty.FoodApp.menu.dto.MenuDTO;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderItemDTO {

    private Long id;

    private int quantity;

    private Long menuId;

    private MenuDTO menu;

    private BigDecimal pricePerUnit;

    private BigDecimal subtotal;
}