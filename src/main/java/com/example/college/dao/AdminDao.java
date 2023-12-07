package com.example.college.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.college.model.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {
	   
       boolean existsByName(String Name);
//
//	     Admin findByName(String name);
//	     Admin findByPassword(String password);
	     
	     @Query("select u from Admin u where u.email = :email")
	     Admin findByName(@Param("email") String email);

}
 
//@Repository
//@EnableMongoRepositories(basePackages="com.example.college.controller,"+"com.example.college.service,"+"com.example.college")
//public interface AdminDao extends MongoRepository<Admin, Long> {
	   
//       boolean existsByName(String Name);
//
//	     Admin findByName(String name);
//	     Admin findByPassword(String password);
	     
//	     @Query("select u from Admin u where u.email = :email")
//	     Admin findByName(@Param("email") String email);

//}
 