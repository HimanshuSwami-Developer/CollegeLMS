package com.example.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.dao.StudentDao;
import com.example.college.model.Admin;
import com.example.college.model.Student;
import com.example.college.service.AdminServiceImp;
import com.example.college.service.StudentServiceImp;




@RestController
@EnableAutoConfiguration
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentDao dao ;
	
	@Autowired
	private StudentServiceImp studentService;
	
	@PostMapping("/addStudentTest")
	public Student saveStudent( @RequestBody Student student ) {
		System.out.println(student);
		this.studentService.saveStudent(student);
		return this.studentService.saveStudent(student);   
	}
	
	@PutMapping("/update/{s_Id}")
	public Student UpdateEnp(@PathVariable int s_Id)
	{
		return this.studentService.editStudent(s_Id);
		
	}


	@DeleteMapping("/delete/{s_Id}")
	public Student DeleteEnp( @PathVariable int s_Id   ) {
		return this.studentService.deleteStudent(s_Id) ;			
		
	}

	
	
}


