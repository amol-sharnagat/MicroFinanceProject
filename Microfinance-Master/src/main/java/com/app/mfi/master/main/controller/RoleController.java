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
import com.app.mfi.master.main.model.Role;

@RestController
@CrossOrigin("*")
public class RoleController {
	@Autowired
	HomeService hs;
	
	@PostMapping("/postrole")
     public String m1(@RequestBody Role r)
     {
		hs.saveRole(r);
		return null;
     }
	
	@GetMapping("/getrole")
	public List<Role> m2()
	{
		List<Role> l=hs.getRoledetails();
		return l;
	}
	
	@PutMapping("/putrole")
	public Role m3(@RequestBody Role rl)
	{
		Role ro=hs.updateRole(rl);
		return ro;
	}
	
	@DeleteMapping("/delrole/{id}")
	public String m4(@PathVariable int id)
	{
		hs.deleteRole(id);
		return "deleted";
	}
}
