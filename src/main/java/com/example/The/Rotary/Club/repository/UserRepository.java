package com.example.The.Rotary.Club.repository;

import com.example.The.Rotary.Club.entity.User;
import com.example.The.Rotary.Club.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByMemberId(String memberId);
    List<User> findByRole(Role role);
}