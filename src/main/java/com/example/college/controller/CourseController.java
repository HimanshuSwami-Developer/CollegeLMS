package com.example.college.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import com.example.college.dao.CourseDao;
import com.example.college.model.Course;
import com.example.college.service.CourseServiceImp;

@RestController
@EnableAutoConfiguration
@RequestMapping("/course")
public class CourseController {
	
		@Autowired
		private CourseDao dao;
		
		
		@Autowired
		private CourseServiceImp courseService;
		
			
		@PostMapping(value ="/addCourse")
		public Course saveCourse( @RequestBody Course course ) {
			
			return this.courseService.saveCourse(course);
		}
		
		@PutMapping("/update/{c_Id}")
		public Course UpdateEnp(@PathVariable int c_Id)
		{
			return this.courseService.editCourse(c_Id);
			
		}


		@DeleteMapping("/delete/{c_Id}")
		public Course DeleteEnp( @PathVariable int c_Id   ) {
			return this.courseService.deleteCourse(c_Id) ;			
			
		}
	}
