package com.example.college.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.college.dao.AdminDao;
import com.example.college.model.Admin;

@Service
public class AdminServiceImp implements AdminService{

//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private AdminDao dao;
	
	@Override
	public Admin saveAdmin(Admin admin) {
	
		Admin own =dao.save(admin);
	   System.out.println("success");
		return own;
	}

	
//	@Override
//	public boolean loginAdmin(String name,String password) {
//		boolean e1 = dao.existsByName(name);
//		boolean pass=false;
//		if(e1==true) {
//			Integer id=dao.findByName(name).getId();
//			Admin ad = dao.findById(id).orElseThrow();
//		Optional<Admin> ad=dao.findById(id);
////		   String passes=admin.getPassword();
//		   
////				   .equalsIgnoreCase(password);
//		System.out.println(ad); 
//		System.out.println("helo");
//		}
//		return e1;
//		return null;
		// TODO Auto-generated method stub
		
//	}
	
	@Override
	public Admin loginAdmin(Integer id) {
//		boolean e1 = dao.existsByName(name);
//		boolean pass=false;
//		if(e1==true) {
//			Admin admin=dao.findById(1);
//		Admin ad = dao.findById(id).orElseThrow();
////		   String passes=admin.getPassword();
//		   
////				   .equalsIgnoreCase(password);
//		System.out.println(name); 
//		System.out.println("helo");
//		System.out.println(ad);
//		}
		return null;
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean loginAdmin(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}


//	@Override
//	public boolean loginAdmin(String name, String password, Integer id) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	@Override
//	public Admin deleteEmployee(Integer enpid) {
//		Admin   e1  = dao.findById(enpid).orElseThrow();
//		dao.delete(e1) ;
//		  
////		  Enployee  e  = dao.deleteById(enpid) ;
//		// TODO Auto-generated method stub
//		return e1;
//	}
//
//	@Override
//	public Admin updateEmp(Integer enpid) {
//		// TODO Auto-generated method stub
//		Admin   e1  = dao.findById(enpid).orElseThrow();
//		e1.setEmpName("kartik");
//		Admin empp =dao.save(e1);
//		return empp;
//		}
//	
//	
//	@Override
//	public List<Admin> getEmployee() {
//		List<Admin>  listofENP = dao.findAll();
//		
//		// TODO Auto-generated method stub
//		return listofENP;
//	}
//
//	@Override
//	public Admin getEmployeeOne(String enpName) {
//		Admin e1 = dao.findByEmpName(enpName);
//		System.out.println(e1);
//		// TODO Auto-generated method stub
//		return e1;
//	}
//	
//	@Override
//	public boolean Login(String empName) {
//		boolean e1 = dao.existsByEmpName(empName);
//		
//		// TODO Auto-generated method stub
//		return e1;
//	}
//
	
	
	
}
