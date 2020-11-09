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
import com.app.mfi.master.main.model.State;

@RestController
@CrossOrigin("*")
public class StateController {
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/poststate")
	public String m1(@RequestBody State s)
	{
		hs.saveState(s);
		return "Registered";
	}
	
	@GetMapping("/getstate")
	public List<State> m2()
	{
		List<State> list=hs.getStatedetails();
		return list;
	}
	
	@PutMapping("/putstate")
	public State m3(@RequestBody State s)
	{
		State st=hs.updateState(s);
		return st;
	}
	
	@DeleteMapping("/delstate/{id}")
	public String m4(@PathVariable int id)
	{
		hs.deleteState(id);
		return "deleted Successfully";
	}

}
