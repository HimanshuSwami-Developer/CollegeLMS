package com.example.college.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.college.model.Course;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {
	   

}
