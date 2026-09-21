package com.example.The.Rotary.Club.service;

import com.example.The.Rotary.Club.entity.User;
import com.example.The.Rotary.Club.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllMembers() {
        return userRepository.findAll();
    }

    public User getMemberById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Member not found with id: " + id));
    }

    public User createMember(User user) {
        return userRepository.save(user);
    }

    public User updateMember(Long id, User updated) {
        User existing = getMemberById(id);
        existing.setFullName(updated.getFullName());
        existing.setPhone(updated.getPhone());
        existing.setClassification(updated.getClassification());
        existing.setClubRole(updated.getClubRole());
        existing.setStatus(updated.getStatus());
        return userRepository.save(existing);
    }

    public void deleteMember(Long id) {
        userRepository.deleteById(id);
    }
}