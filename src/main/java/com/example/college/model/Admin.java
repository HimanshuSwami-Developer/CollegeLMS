package com.example.college.model;



import jakarta.persistence.*;

@Entity
//@Document( collection="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ;
	
	@Column
	private String name ;

	
	private String email ;
	
	private String password ;
	private String schoolName;
	private String role;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", schoolName="
				+ schoolName + ", role=" + role + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getPassword()=" + getPassword() + ", getSchoolName()=" + getSchoolName()
				+ ", getRole()=" + getRole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Admin(Integer id, String name, String email, String password, String schoolName, String role) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.schoolName = schoolName;
		this.role = role;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
//	@ManyToOne
//	@JoinColumn(EmpName="DeptId")
//	private  Department dept ;

	}
