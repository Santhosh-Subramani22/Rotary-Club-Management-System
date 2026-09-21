package com.example.The.Rotary.Club.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String memberId;

    @Column(nullable = false)
    private String fullName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String phone;
    private String classification;
    private String clubRole;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    private String status;
    private LocalDate joinedDate;

    public User() {}

    public User(Long id, String memberId, String fullName, String email, String password,
                String phone, String classification, String clubRole, Role role,
                String status, LocalDate joinedDate) {
        this.id = id;
        this.memberId = memberId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.classification = classification;
        this.clubRole = clubRole;
        this.role = role;
        this.status = status;
        this.joinedDate = joinedDate;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getClassification() { return classification; }
    public void setClassification(String classification) { this.classification = classification; }
    public String getClubRole() { return clubRole; }
    public void setClubRole(String clubRole) { this.clubRole = clubRole; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public LocalDate getJoinedDate() { return joinedDate; }
    public void setJoinedDate(LocalDate joinedDate) { this.joinedDate = joinedDate; }
}