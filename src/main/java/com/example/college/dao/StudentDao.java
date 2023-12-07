package com.example.college.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.college.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	   

}
