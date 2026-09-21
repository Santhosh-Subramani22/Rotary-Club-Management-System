package com.example.The.Rotary.Club.controller;

import com.example.The.Rotary.Club.dto.ReportSummaryDTO;
import com.example.The.Rotary.Club.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "*")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/summary")
    public ResponseEntity<ReportSummaryDTO> getSummary() {
        return ResponseEntity.ok(reportService.getSummary());
    }
}