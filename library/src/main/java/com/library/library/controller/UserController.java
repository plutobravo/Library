package com.library.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.library.Repository.UserRepository;
import com.library.library.entities.User;
import com.library.library.service.UserService;

@RestController
@RequestMapping("/RestTemplate")
public class UserController {
	@Autowired
	private UserService restTemplateUserService;
	
	@Autowired
	public UserRepository repository;

	@PostMapping("/addUser")
	public String saveuser(@RequestBody User user ) {
		 repository.save(user);
		return "user added";}
		
//		@GetMapping("/GetAllBooks")
//		public ResponseEntity<String>GetAllBooks(){
//	}
}