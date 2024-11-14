package com.example.videoapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.videoapi.model.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
    Optional<Video> findBySlug(String slug);
}
