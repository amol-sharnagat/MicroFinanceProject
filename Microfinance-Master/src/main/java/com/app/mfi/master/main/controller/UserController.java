package com.app.mfi.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.mfi.master.main.homeservice.HomeService;

import com.app.mfi.master.main.model.User;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	HomeService hr;
	@PostMapping("/postuser")
	public String m1(@RequestBody User u)
	{
		hr.savedUser(u);
		return "Registered";
	}
	
	@GetMapping("/getuser")
	public List<User> m2()
	{
		List<User> l=hr.getUserdetails();
		return l;
	}
	
	@PutMapping("/putuser")
	public User m3(@RequestBody User u)
	{
		User ur=hr.updateUser(u);
		return ur;
	}
	
	@DeleteMapping("/deluser/{id}")
	public String m4(@PathVariable int id)
	{
		hr.deleteUser(id);
		return "deleted";
	}

}
