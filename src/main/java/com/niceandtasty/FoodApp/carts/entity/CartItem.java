package com.niceandtasty.FoodApp.carts.entity;

import com.niceandtasty.FoodApp.menu.entity.Menu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "cart_items")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart ;
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu  ;

    private int quantity  ;

    private BigDecimal pricePerUnit ;

    private BigDecimal subtotal ;
}
