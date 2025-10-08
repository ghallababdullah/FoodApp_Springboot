package com.niceandtasty.FoodApp.category.dto;

import com.niceandtasty.FoodApp.menu.entity.Menu;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class CategoryDTO {

    private Long id ;

    @NotBlank(message = "A name is required ")
    private String name ;

    private String description ;


    private List<Menu> menus ;


}
