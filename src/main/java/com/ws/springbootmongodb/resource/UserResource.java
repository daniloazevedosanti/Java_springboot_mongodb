package com.ws.springbootmongodb.resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ws.springbootmongodb.domain.User;
import com.ws.springbootmongodb.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@Autowired
	private UserService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		//User maria = new User("1", "Maria name", "mariaemail@gmail.com");
		//User joao = new User("2", "joao b", "joaoemail@gmail.com");
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
}
