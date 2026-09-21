package com.example.The.Rotary.Club.dto;

import java.math.BigDecimal;

public class ReportSummaryDTO {
    private long totalMembers;
    private long totalEvents;
    private long totalMeetings;
    private long activeProjects;
    private BigDecimal totalProjectBudget;
    private BigDecimal totalFundsRaised;
    private long totalBeneficiariesServed;

    public ReportSummaryDTO() {}

    public long getTotalMembers() { return totalMembers; }
    public void setTotalMembers(long totalMembers) { this.totalMembers = totalMembers; }
    public long getTotalEvents() { return totalEvents; }
    public void setTotalEvents(long totalEvents) { this.totalEvents = totalEvents; }
    public long getTotalMeetings() { return totalMeetings; }
    public void setTotalMeetings(long totalMeetings) { this.totalMeetings = totalMeetings; }
    public long getActiveProjects() { return activeProjects; }
    public void setActiveProjects(long activeProjects) { this.activeProjects = activeProjects; }
    public BigDecimal getTotalProjectBudget() { return totalProjectBudget; }
    public void setTotalProjectBudget(BigDecimal totalProjectBudget) { this.totalProjectBudget = totalProjectBudget; }
    public BigDecimal getTotalFundsRaised() { return totalFundsRaised; }
    public void setFundsRaised(BigDecimal totalFundsRaised) { this.totalFundsRaised = totalFundsRaised; }
    public long getTotalBeneficiariesServed() { return totalBeneficiariesServed; }
    public void setTotalBeneficiariesServed(long totalBeneficiariesServed) { this.totalBeneficiariesServed = totalBeneficiariesServed; }
}