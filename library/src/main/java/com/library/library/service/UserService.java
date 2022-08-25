package com.library.library.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.library.library.Repository.UserRepository;
import com.library.library.entities.User;

@Service
public class UserService {
	
     User restTemplate = new User();

	//method to get all books
//	 public ResponseEntity<String>GetAllBooks(){
//		 
//		 HttpHeaders headers = new HttpHeaders();
//		 
//		 headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//		 
//		 HttpEntity<String>entity= new HttpEntity<String>("parameters", headers);
//		 
//		 ResponseEntity<String> response= restTemplate.exchange(url, method, requestEntity, responseType)
//
//	 }
	 
	 
//		@Autowired
//		public UserRepository repository;
	//	
//		public String saveuser(User user) {
//			repository.save(user);
//			return "User details is successfully updated";
//		}
}
