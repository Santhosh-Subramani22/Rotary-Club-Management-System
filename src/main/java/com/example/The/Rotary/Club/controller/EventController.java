package com.example.The.Rotary.Club.controller;

import com.example.The.Rotary.Club.entity.Event;
import com.example.The.Rotary.Club.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/events")
@CrossOrigin(origins = "*")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public ResponseEntity<List<Event>> getAll() {
        return ResponseEntity.ok(eventRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<Event> create(@RequestBody Event event) {
        if (event.getRegisteredCount() == null) event.setRegisteredCount(0);
        return ResponseEntity.ok(eventRepository.save(event));
    }

    @PostMapping("/{id}/rsvp")
    public ResponseEntity<Event> rsvp(@PathVariable Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found"));
        event.setRegisteredCount(event.getRegisteredCount() + 1);
        return ResponseEntity.ok(eventRepository.save(event));
    }
}