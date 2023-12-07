package com.example.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college.dao.CourseDao;
import com.example.college.model.Admin;
import com.example.college.model.Course;

@Service
public class CourseServiceImp implements CourseService {
	
	@Autowired
	private CourseDao dao ;
	
	
	@Override
	public Course saveCourse(Course course) {
		Course own =dao.save(course);
		return own;
	}


	@Override
	public Course deleteCourse(Integer c_id) {
		Course   e1  = dao.findById(c_id).orElseThrow();
		dao.delete(e1) ;
		  
		return e1;
	}


	@Override
	public Course editCourse(Integer c_id) {
		Course   e1  = dao.findById(c_id).orElseThrow();
		e1.setCourseName("");
		Course empp =dao.save(e1);
		return empp;
		
	}


	@Override
	public List<Course> getCourse() {
		List<Course>  listofCourse = dao.findAll();
		
		return listofCourse;
}
	

}
