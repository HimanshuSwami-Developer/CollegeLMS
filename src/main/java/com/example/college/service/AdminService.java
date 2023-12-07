package com.example.college.service;

import java.util.List;

import com.example.college.model.Admin;

public interface AdminService {
  
	
	public Admin saveAdmin(Admin admin);
	
	public boolean loginAdmin(String name,String password);
	

	public Admin loginAdmin(Integer id);
	
//	public Admin deleteEmployee(Integer emp_id);
//	
//	public Admin updateEmp(Integer emp_id);
//		
//	public List<Admin> getEmployee();
//	
//	public Admin getEmployeeOne(String emp_name);
//	
//	public boolean Login(String emp_name);
//	public boolean Login(Integer emp_id);
}
