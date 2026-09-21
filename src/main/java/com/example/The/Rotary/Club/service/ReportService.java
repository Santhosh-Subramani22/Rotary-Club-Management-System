package com.example.The.Rotary.Club.service;

import com.example.The.Rotary.Club.dto.ReportSummaryDTO;
import com.example.The.Rotary.Club.entity.ServiceProject;
import com.example.The.Rotary.Club.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ReportService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private MeetingRepository meetingRepository;

    @Autowired
    private ServiceProjectRepository projectRepository;

    public ReportSummaryDTO getSummary() {
        List<ServiceProject> projects = projectRepository.findAll();

        BigDecimal totalBudget = BigDecimal.ZERO;
        BigDecimal totalRaised = BigDecimal.ZERO;
        long totalBeneficiaries = 0;
        long activeProjects = 0;

        for (ServiceProject p : projects) {
            if (p.getBudget() != null) totalBudget = totalBudget.add(p.getBudget());
            if (p.getFundsRaised() != null) totalRaised = totalRaised.add(p.getFundsRaised());
            if (p.getTargetBeneficiaries() != null) totalBeneficiaries += p.getTargetBeneficiaries();
            if ("IN_PROGRESS".equalsIgnoreCase(p.getStatus())) activeProjects++;
        }

        ReportSummaryDTO dto = new ReportSummaryDTO();
        dto.setTotalMembers(userRepository.count());
        dto.setTotalEvents(eventRepository.count());
        dto.setTotalMeetings(meetingRepository.count());
        dto.setActiveProjects(activeProjects);
        dto.setTotalProjectBudget(totalBudget);
        dto.setFundsRaised(totalRaised);
        dto.setTotalBeneficiariesServed(totalBeneficiaries);

        return dto;
    }
}