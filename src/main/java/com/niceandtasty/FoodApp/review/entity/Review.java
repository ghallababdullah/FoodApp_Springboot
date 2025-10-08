package com.niceandtasty.FoodApp.review.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.niceandtasty.FoodApp.auth_user.entity.User;
import com.niceandtasty.FoodApp.menu.entity.Menu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Customer who wrote the review

    private Integer rating; // e.g., 1 to 10 stars

    @Column(columnDefinition = "TEXT")
    private String comment;

    private LocalDateTime createdAt;

    @Column(name = "order_id")
    private Long orderId;


    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu; // menu here is a dish or food so one food can have multiple reviews but one review can be for one dish only

}
