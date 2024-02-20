package com.notification_demo.service;

import com.notification_demo.entities.Notification;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface NotificationService {
    public Notification saveNotificationDetails(Notification notification);
}
