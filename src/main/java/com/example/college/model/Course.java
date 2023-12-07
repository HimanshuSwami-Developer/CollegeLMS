package com.example.college.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
public class Course {

   
	@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="c_id")
	Integer cId;
	String courseName;
	 
	
	
	@ManyToOne
	@JoinColumn(name="s_id")
	Student student;

	


	public Integer getcId() {
		return cId;
	}



	public void setcId(Integer cId) {
		this.cId = cId;
	}



	public String getCourseName() {
		return courseName;
	}



	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", student=" + student + "]";
	}



	public Course(Integer cId, String courseName, Student student) {
		super();
		this.cId = cId;
		this.courseName = courseName;
		this.student = student;
	}



	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
