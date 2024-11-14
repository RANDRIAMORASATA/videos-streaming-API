package com.example.videoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.videoapi.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
