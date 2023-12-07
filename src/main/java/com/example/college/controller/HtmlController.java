package com.example.college.controller;

import java.net.URI;
import java.net.http.*;
import java.util.List;
import java.util.Optional;

import org.aspectj.bridge.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.college.dao.AdminDao;
import com.example.college.dao.StudentDao;
import com.example.college.model.Admin;
import com.example.college.model.Student;
import com.example.college.service.AdminServiceImp;
import com.example.college.service.StudentServiceImp;

@EnableAutoConfiguration
@RequestMapping("/")
@Controller
public class HtmlController {
	
	
	@Autowired
	private AdminDao dao ;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	
	@Autowired
	private AdminServiceImp adminService;
	
	
	@Autowired
	private StudentDao sdao ;
	
	@Autowired
	private StudentServiceImp studentService;
	
	
	
	@RequestMapping("index")
	public String index(Model model ) {
		model.addAttribute("title", "home page");
		return "index";
	}
	
	
	@RequestMapping("registerpage")
	public String register(Model model) {	
		return "registerpage";
	}	
	
	

	@RequestMapping("signin")
	public String dologin() {	
//		System.out.println(admin.getEmail());
		return "index";
	}	

	@RequestMapping("login")
	public String login() {	
//		System.out.println(admin.getEmail());
		return "login";
	}	
	
	@RequestMapping("student")
	public String student() {
		return "addstudent";
	}
//	consumes ={"application/json"}
//	@RequestMapping(value="student/addstudent",method = RequestMethod.POST
////			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE
//			)
//	public String saveStudent( @ModelAttribute Student student ) {
//		System.out.println(student);
//		this.studentService.saveStudent(student);
//		System.out.println(student.toString());
//		return "index";
//	}	


//	@PostMapping(value="student/addStudent",consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
//	public String saveStudent( @RequestBody Student student ) {
//		System.out.println(student);
//		this.studentService.saveStudent(student);
//		System.out.println(student.toString());
//		return "index";
//	}
	
//	@RequestMapping("logout")
//	public String login() {	
//		return "login";
//	}	
	

	@RequestMapping("register")
	public String register(@RequestBody Admin admin) {
//		System.out.println(admin.getEmail());
		String encodedPassword = passwordEncoder.encode(admin.getPassword());
		if(encodedPassword==null) {
			System.out.println("null");
		}
		admin.setPassword(encodedPassword);
		System.out.println(admin.toString());
		 this.adminService.saveAdmin(admin);
		return "registerpage";
	}	
	
	
	
	
	
	
}
