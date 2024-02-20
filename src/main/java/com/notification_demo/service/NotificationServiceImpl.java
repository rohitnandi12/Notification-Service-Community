package com.notification_demo.service;

import com.notification_demo.entities.Notification;
import com.notification_demo.repo.NotificationRepo;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
     private NotificationRepo notificationRepo;
    @Override
    public Notification saveNotificationDetails(Notification notification) {
         return notificationRepo.save(notification);
    }
}
