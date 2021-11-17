package com.prashanth.bikeRental.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/allUsers")
	public List<String> getAllUsers(){
		return Arrays.asList("Prashanth", "Hari");
	}
	
	@GetMapping("/checkedoutUsers")
	public List<String> getCheckedoutUsers(){
		return Arrays.asList("Prashanth");
	}
	

}
