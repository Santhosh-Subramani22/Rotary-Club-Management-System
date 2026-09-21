package com.example.The.Rotary.Club.service;

import com.example.The.Rotary.Club.dto.AuthRequest;
import com.example.The.Rotary.Club.dto.AuthResponse;
import com.example.The.Rotary.Club.entity.User;
import com.example.The.Rotary.Club.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public AuthResponse authenticate(AuthRequest request) {
        String email = request.getEmail() != null ? request.getEmail().trim() : "";
        String password = request.getPassword() != null ? request.getPassword().trim() : "";

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("No user registered with email: " + email));

        if (!user.getPassword().trim().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return new AuthResponse(
                user.getId(),
                user.getMemberId(),
                user.getFullName(),
                user.getEmail(),
                user.getRole(),
                "ROTARY-AUTH-" + user.getId(),
                "Login Successful"
        );
    }
}