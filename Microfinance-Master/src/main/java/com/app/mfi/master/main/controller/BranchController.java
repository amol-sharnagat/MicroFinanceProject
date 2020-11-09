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

import com.app.mfi.master.main.homerepository.BranchRepository;
import com.app.mfi.master.main.homeservice.HomeService;
import com.app.mfi.master.main.model.Branch;

@RestController
@CrossOrigin("*")
public class BranchController {
	
	@Autowired
	HomeService hr;
	
	@Autowired
	BranchRepository br;
	
	@PostMapping("/postbranch")
	public String m1(@RequestBody Branch b)
	{
		
		hr.saveBranch(b);
		return "registered";
	}
	
	@GetMapping("/getbranch")
	public List<Branch> m2()
	{
		List<Branch> list=hr.getBranchdetails();
		return list;
	}

	/*
	 * @GetMapping("/getbranch/{branch_IFSC}") public Branch getBranch(@PathVariable
	 * String ifsc) { return br.findByBranch_IFSC(ifsc); }
	 */
	@PutMapping("/putbranch")
	public Branch m3(@RequestBody Branch b)
	{
		Branch br=hr.updateBranch(b);
		return br;
	}
	
	@DeleteMapping("/delbranch/{id}")
	public String m4(@PathVariable int id)
	{
		hr.deleteBranch(id);
		return "deleted";
	}

}
