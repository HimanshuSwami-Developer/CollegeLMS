package com.example.college.controller;

import java.net.URI;
import java.net.http.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.college.dao.AdminDao;
import com.example.college.model.Admin;
import com.example.college.service.AdminServiceImp;

@RestController
@EnableAutoConfiguration
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Autowired
	private AdminDao dao ;
	
	
	@Autowired
	private AdminServiceImp adminService;
	
	
//	@GetMapping("/dashboard")
//	@RequestMapping("/dashboard")
//	public String dashboard() {
//		return "dashboard";
//	}
	
//	@RequestMapping("/index")
//	public String index() {
//		return "index";
//	}
	
	

//	@PostMapping(value ="/register")
//	public Admin saveAdmins( @RequestBody Admin admin ) {
//		admin.setPassword(passwordEncoder.encode(admin.getPassword()));
//		
//		return this.adminService.saveAdmin(admin);
//	}
//	
	
//	@PostMapping(value ="/login/{name}/{password}")
//	public boolean loginAdmins( @PathVariable String name,@PathVariable String password) {
//		
//		return this.adminService.loginAdmin(name,password);
//	}
//	
//
//	@PostMapping(value ="/login/{id}")
//	public  Admin loginAdmins( @PathVariable Integer id ) {
//		
//		return this.adminService.loginAdmin(id);
//	}
	
	
	
	
	
//	@GetMapping("/getAll")
//	public List<AdminController> getAllEnp() {
//		
////		List<Enployee>  listofENP = dao.findAll();
//		return this.empService.getEmployee() ;
////		return null; 
//		
//	}
	
	
//	@GetMapping("/hi")
//	public String helloWorld() {
//		
//		String s  = "hello" ;
//		return s ;
//		
//		
//	}
	
//	@DeleteMapping("/deleteEnpolyee/{enpId}")
//	public AdminController DeleteEnp( @PathVariable int enpId   ) {
//		
////		 Enployee   e1  = dao.findById(enpId).orElseThrow();
//		 
////		 dao.delete(e1) ;
//		  
//		  //Enployee  e  = dao.deleteById(enpId) ;
////		return e1;
//		return this.empService.deleteEmployee(enpId) ;
//		
//		
//	}
//	
//	
//	@PutMapping("/update/{enpId}")
//	public AdminController UpdateEnp(@PathVariable int enpId)
//	{
//		return this.empService.updateEmp(enpId);
//		
//	}
//	
//	@GetMapping("/getOne/{enpName}")
//	public AdminController getOne(@PathVariable String enpName)
//	{
//		return this.empService.getEmployeeOne(enpName);
//		
//	}
//
//
//	@PostMapping(value ="/login/{enpName}")
//	public boolean Login(@PathVariable  String enpName) {
//		
////		List<Enployee>  listofENP = dao.findAll();
//		return this.empService.Login(enpName) ;
////		return null; 
//		
//	}
	
	
}
