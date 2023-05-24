package com.projects.praticandoAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.praticandoAPI.modelo.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}