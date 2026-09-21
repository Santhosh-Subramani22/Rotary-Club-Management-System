package com.example.The.Rotary.Club.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "service_projects")
public class ServiceProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String projectName;

    private String avenueOfService;

    @Column(columnDefinition = "TEXT")
    private String description;

    private BigDecimal budget;
    private BigDecimal fundsRaised;
    private Integer targetBeneficiaries;
    private Integer volunteersCount;

    private LocalDate startDate;
    private LocalDate targetCompletionDate;
    private String status;

    public ServiceProject() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getProjectName() { return projectName; }
    public void setProjectName(String projectName) { this.projectName = projectName; }
    public String getAvenueOfService() { return avenueOfService; }
    public void setAvenueOfService(String avenueOfService) { this.avenueOfService = avenueOfService; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public BigDecimal getBudget() { return budget; }
    public void setBudget(BigDecimal budget) { this.budget = budget; }
    public BigDecimal getFundsRaised() { return fundsRaised; }
    public void setFundsRaised(BigDecimal fundsRaised) { this.fundsRaised = fundsRaised; }
    public Integer getTargetBeneficiaries() { return targetBeneficiaries; }
    public void setTargetBeneficiaries(Integer targetBeneficiaries) { this.targetBeneficiaries = targetBeneficiaries; }
    public Integer getVolunteersCount() { return volunteersCount; }
    public void setVolunteersCount(Integer volunteersCount) { this.volunteersCount = volunteersCount; }
    public LocalDate getStartDate() { return startDate; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public LocalDate getTargetCompletionDate() { return targetCompletionDate; }
    public void setTargetCompletionDate(LocalDate targetCompletionDate) { this.targetCompletionDate = targetCompletionDate; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}