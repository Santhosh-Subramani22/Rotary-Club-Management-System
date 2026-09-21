package com.example.The.Rotary.Club.controller;

import com.example.The.Rotary.Club.entity.Announcement;
import com.example.The.Rotary.Club.repository.AnnouncementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/announcements")
@CrossOrigin(origins = "*")
public class AnnouncementController {

    @Autowired
    private AnnouncementRepository announcementRepository;

    @GetMapping
    public ResponseEntity<List<Announcement>> getAll() {
        return ResponseEntity.ok(announcementRepository.findAllByOrderByPublishedAtDesc());
    }

    @PostMapping
    public ResponseEntity<Announcement> create(@RequestBody Announcement announcement) {
        announcement.setPublishedAt(LocalDateTime.now());
        return ResponseEntity.ok(announcementRepository.save(announcement));
    }
}