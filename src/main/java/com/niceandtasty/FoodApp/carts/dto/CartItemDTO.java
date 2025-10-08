package com.niceandtasty.FoodApp.carts.dto;

import com.niceandtasty.FoodApp.menu.dto.MenuDTO;

import java.math.BigDecimal;

public class CartItemDTO {

    private Long id ;


    private MenuDTO menu  ;

    private int quantity  ;

    private BigDecimal pricePerUnit ;

    private BigDecimal subtotal ;
}
