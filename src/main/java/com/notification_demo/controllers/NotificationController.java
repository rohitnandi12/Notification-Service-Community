package com.notification_demo.controllers;


import com.notification_demo.entities.Notification;
import com.notification_demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;

    @PostMapping("/notification_details")
    public String saveNotifications(@RequestBody Notification notification)
    {
        notificationService.saveNotificationDetails(notification);
        return "Successfully posted";

    }
}
