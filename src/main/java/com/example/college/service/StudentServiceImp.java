package com.example.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college.dao.StudentDao;
import com.example.college.model.Student;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentDao dao;
	
	@Override
	public Student saveStudent(Student student) {
		System.out.println(student.toString());
		Student own =dao.save(student);
		return own;
	}

	

	@Override
	public Student deleteStudent(Integer s_id) {
		Student   e1  = dao.findById(s_id).orElseThrow();
		dao.delete(e1) ;
		return e1;
	}


	@Override
	public Student editStudent(Integer s_id) {
		Student   e1  = dao.findById(s_id).orElseThrow();
		e1.setStudentName("");
		Student empp =dao.save(e1);
		return empp;
		
	}


	@Override
	public List<Student> getStudent() {
		List<Student>  listofStudent = dao.findAll();
		
		return listofStudent;
}
	

}
