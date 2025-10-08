package com.niceandtasty.FoodApp.review.dto;
import jakarta.validation.constraints.*;
import lombok.Data;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewDTO {

    private Long id;
    private Long menuId;
    private Long orderId;

    private String userName;

    @NotNull(message = "Rating is required")
    @Min(1)
    @Max(5)
    private Integer rating;

    @Size(max = 500, message = "Comment cannot exceed 500 characters")
    private String comment;

    private String menuName;

    private LocalDateTime createdAt;}