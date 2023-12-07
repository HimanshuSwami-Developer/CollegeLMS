package com.example.college.service;

import java.util.List;

import com.example.college.model.Course;

public interface CourseService {


	public Course saveCourse(Course course);
	
	public Course deleteCourse(Integer c_id);
	
	public Course editCourse(Integer c_id);
	
	public List<Course> getCourse();
	

}
