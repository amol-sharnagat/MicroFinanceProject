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
import com.app.mfi.master.main.model.Loan_Type;
import com.app.mfi.master.main.model.Status;
@RestController
@CrossOrigin("*")
public class Loan_TypeController {
	@Autowired
	HomeService hr;
	
	
	@PostMapping("/Postloan")
	public String m2(@RequestBody Loan_Type l)
	{
		hr.savedata(l);
		
		return "Registered";
	}
	
	@GetMapping("/getloan")
	public List<Loan_Type> m3()
	{
		List<Loan_Type> list=hr.getloandetails();
		return list;
	}
	
	@PutMapping("/putloan/{id}")
	public Loan_Type m4(@PathVariable int id,@RequestBody Loan_Type l)
	{
		
		Loan_Type l1=hr.updateloan_status(l);
		return l1;
	}
	
	@DeleteMapping("/delloan/{id}")
	public void m5(@PathVariable int id)
	{
		hr.deleteloan_type(id);
	}

}
