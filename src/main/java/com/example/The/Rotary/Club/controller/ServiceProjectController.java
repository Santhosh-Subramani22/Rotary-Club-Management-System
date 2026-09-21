package com.example.The.Rotary.Club.controller;

import com.example.The.Rotary.Club.entity.ServiceProject;
import com.example.The.Rotary.Club.repository.ServiceProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "*")
public class ServiceProjectController {

    @Autowired
    private ServiceProjectRepository projectRepository;

    @GetMapping
    public ResponseEntity<List<ServiceProject>> getAll() {
        return ResponseEntity.ok(projectRepository.findAll());
    }

    @PostMapping
    public ResponseEntity<ServiceProject> create(@RequestBody ServiceProject project) {
        return ResponseEntity.ok(projectRepository.save(project));
    }
}