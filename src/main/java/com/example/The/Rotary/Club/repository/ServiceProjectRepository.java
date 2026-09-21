package com.example.The.Rotary.Club.repository;

import com.example.The.Rotary.Club.entity.ServiceProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceProjectRepository extends JpaRepository<ServiceProject, Long> {
}