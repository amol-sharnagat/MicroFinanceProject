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
import com.app.mfi.master.main.model.Country;

@RestController
@CrossOrigin("*")
public class CountryController {
	
	@Autowired
	HomeService hs;
	@PostMapping("/postcountry")
	public String m1(@RequestBody Country c)
	{
		hs.saveCountry(c);
		return "Registered";
	}
	
	@GetMapping("/getcountry")
	public List<Country> m2()
	{
		List<Country> l=hs.getCountrydetails();
		return l;
	}
	
	@PutMapping("/putcountry/{id}")
	public Country m3(@PathVariable int id,@RequestBody Country c)
	{
		Country cr=hs.updateCountry(c);
		return cr;
	}
	
	@DeleteMapping("delcountry/{id}")
	public void m4(@PathVariable int id)
	{
		hs.deleteCountry(id);
	}

}
