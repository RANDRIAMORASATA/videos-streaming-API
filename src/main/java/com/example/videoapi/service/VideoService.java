package com.example.videoapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.videoapi.model.Video;
import com.example.videoapi.repository.VideoRepository;

@Service
public class VideoService {

    @Autowired
    private VideoRepository videoRepository;

    public List<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Optional<Video> getVideoById(Long id) {
        return videoRepository.findById(id);
    }

    public Video addVideo(Video video) {
        return videoRepository.save(video);
    }

    public Video updateVideo(Long id, Video video) {
        if (videoRepository.existsById(id)) {
            video.setId(id);
            return videoRepository.save(video);
        }
        return null;
    }

    public void deleteVideo(Long id) {
        videoRepository.deleteById(id);
    }

    public Video findBySlug(String slug) {
        Optional<Video> videoOpt = videoRepository.findBySlug(slug);
        return videoOpt.orElse(null); // Return null if not found
    }
}
