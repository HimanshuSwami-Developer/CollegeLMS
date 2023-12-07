package com.example.college.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.college.dao.AdminDao;
import com.example.college.model.Admin;

public class AdminDetailServiceImp  implements UserDetailsService{

	@Autowired
	private AdminDao dao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		//fetching dao
		Admin admin= dao.findByName(username);
		if(admin == null ) {
			throw new UsernameNotFoundException("no user");
		}
		
		AdminDetail adminDetail=new AdminDetail(admin);
				
		
		return adminDetail;
	}

}
