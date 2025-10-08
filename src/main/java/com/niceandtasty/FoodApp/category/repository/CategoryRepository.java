package com.niceandtasty.FoodApp.category.repository;

import com.niceandtasty.FoodApp.category.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category , Long> {


}
