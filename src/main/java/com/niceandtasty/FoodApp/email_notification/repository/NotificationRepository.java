package com.niceandtasty.FoodApp.email_notification.repository;

import com.niceandtasty.FoodApp.email_notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

