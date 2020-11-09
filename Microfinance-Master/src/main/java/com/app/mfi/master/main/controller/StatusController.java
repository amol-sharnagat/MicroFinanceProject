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
import com.app.mfi.master.main.model.Status;

@RestController
@CrossOrigin("*")
public class StatusController {
	@Autowired
	HomeService hs;
	
	
	@PostMapping("/poststatus")
	public String m1(@RequestBody Status s)
	{
		
		hs.savestatus(s);
		return "Registered";
	}
	
	@GetMapping("/getstatus")
	public List<Status> m1()
	{
		List<Status> list=hs.getstatusdetails();
		return list;
	}
	
	@PutMapping("/putstatus/{id}")
	public Status update(@PathVariable int id,@RequestBody Status s)
	{
		
		Status stu=hs.updatestatus(s);
		return stu;
	}
	
	@DeleteMapping("/delstatus/{id}")
	public void delete(@PathVariable int id)
	{
		hs.deletestatus(id);
	}
	

}
