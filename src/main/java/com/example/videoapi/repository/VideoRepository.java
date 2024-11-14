package com.example.videoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.videoapi.model.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
