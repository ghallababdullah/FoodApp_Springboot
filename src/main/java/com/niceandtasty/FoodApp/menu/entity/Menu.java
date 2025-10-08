package com.niceandtasty.FoodApp.menu.entity;

import com.niceandtasty.FoodApp.category.entity.Category;
import com.niceandtasty.FoodApp.order.entity.OrderItem;
import com.niceandtasty.FoodApp.review.entity.Review;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "menus")
public class Menu  {  // more like food

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private BigDecimal price;
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "category_id") // Link to the Category entity
    private Category category;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;

    @OneToMany(mappedBy = "menu")
    private List<Review> reviews;



}
