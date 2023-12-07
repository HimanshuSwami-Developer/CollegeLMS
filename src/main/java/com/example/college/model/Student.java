package com.example.college.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;


@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="s_id")
	Integer sId;
	
	String studentName;

	String rollNumber;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "c_id")
	List<Course> course=new ArrayList<>();
	
	
	
	public void setCourse(List<Course> course) {
		this.course = course;
	}


	public Integer getsId() {
		return sId;
	}


	public void setsId(Integer sId) {
		this.sId = sId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Student(Integer sId, String studentName, String rollNumber, List<Course> course) {
		super();
		this.sId = sId;
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.course = course;
	}


	@Override
	public String toString() {
		return "Student [sId=" + sId + ", studentName=" + studentName + ", rollNumber=" + rollNumber + ", course="
				+ course + "]";
	}
	

	
	
	
}
