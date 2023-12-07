package com.example.college.service;

import java.util.List;

import com.example.college.model.Student;

public interface StudentService {

	public Student saveStudent(Student student);

public Student deleteStudent(Integer s_id);
	
	public Student editStudent(Integer s_id);
	
	public List<Student> getStudent();
	
	
}
