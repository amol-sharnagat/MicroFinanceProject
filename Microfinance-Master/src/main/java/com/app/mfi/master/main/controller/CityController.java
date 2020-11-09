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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.mfi.master.main.homeservice.HomeService;
import com.app.mfi.master.main.model.City;

@RestController
@CrossOrigin("*")
public class CityController {
	@Autowired
	HomeService hs;
	@PostMapping("/postcity")
	public String m1(@RequestBody City c)
	{
		System.out.println("HEllo");
		System.out.println(c.getCity_Name());
		hs.saveCity(c);
		return "registered";
	}
	
	@GetMapping("/getcity")
	public List<City> m2()
	{
		List<City> l=hs.getCitydetails();
		return l;
	}
	
	@PutMapping("/putcity")
	public City m3(@RequestBody City c)
	{
		City ci=hs.updateCity(c);
		return ci;
	}
	
	@DeleteMapping("/delcity/{id}")
	public String m4(@PathVariable int id)
	{
		hs.deleteCity(id);
		return "deleted";
	}
	

}
