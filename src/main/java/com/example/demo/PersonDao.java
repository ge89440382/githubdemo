package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Student,Integer> {
}
