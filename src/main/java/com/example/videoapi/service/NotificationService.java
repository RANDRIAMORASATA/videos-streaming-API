package com.example.videoapi.service;

import com.example.videoapi.model.Notification;
import com.example.videoapi.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public Optional<Notification> getNotificationById(Long id) {
        return notificationRepository.findById(id);
    }

    public Notification addNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification updateNotification(Long id, Notification notification) {
        if (notificationRepository.existsById(id)) {
            notification.setId(id);
            return notificationRepository.save(notification);
        }
        return null; // retourne null si la notification n'existe pas
    }

    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
