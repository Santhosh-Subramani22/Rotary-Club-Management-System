package com.example.The.Rotary.Club.dto;

import com.example.The.Rotary.Club.entity.Role;

public class AuthResponse {
    private Long id;
    private String memberId;
    private String fullName;
    private String email;
    private Role role;
    private String token;
    private String message;

    public AuthResponse() {}

    public AuthResponse(Long id, String memberId, String fullName, String email, Role role, String token, String message) {
        this.id = id;
        this.memberId = memberId;
        this.fullName = fullName;
        this.email = email;
        this.role = role;
        this.token = token;
        this.message = message;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}