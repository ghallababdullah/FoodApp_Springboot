package com.niceandtasty.FoodApp.menu.repository;

import com.niceandtasty.FoodApp.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MenuRepository  extends JpaRepository<Menu , Long> , JpaSpecificationExecutor<Menu> {
}
