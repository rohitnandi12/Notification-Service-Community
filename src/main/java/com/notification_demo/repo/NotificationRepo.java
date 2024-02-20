package com.notification_demo.repo;

import com.notification_demo.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface NotificationRepo extends JpaRepository<Notification, Serializable> {
}
