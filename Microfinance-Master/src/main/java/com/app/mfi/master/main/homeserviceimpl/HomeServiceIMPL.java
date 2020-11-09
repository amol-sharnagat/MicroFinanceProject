package com.app.mfi.master.main.homeserviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mfi.master.main.homerepository.BranchRepository;
import com.app.mfi.master.main.homerepository.CityRepository;
import com.app.mfi.master.main.homerepository.CountryRepository;
import com.app.mfi.master.main.homerepository.Loan_TypeRepository;
import com.app.mfi.master.main.homerepository.RoleRepository;
import com.app.mfi.master.main.homerepository.StateRepository;
import com.app.mfi.master.main.homerepository.StatusRepository;
import com.app.mfi.master.main.homerepository.UserRepository;
import com.app.mfi.master.main.homeservice.HomeService;
import com.app.mfi.master.main.model.Branch;
import com.app.mfi.master.main.model.City;
import com.app.mfi.master.main.model.Country;
import com.app.mfi.master.main.model.Loan_Type;
import com.app.mfi.master.main.model.Role;
import com.app.mfi.master.main.model.State;
import com.app.mfi.master.main.model.Status;
import com.app.mfi.master.main.model.User;
@Service
public class HomeServiceIMPL implements HomeService {
	
	//User
	@Autowired 
	UserRepository hu;
	
	@Override
	public void savedUser(User u) {
		hu.save(u);
	}
    @Override
	public List<User> getUserdetails() {
		List<User> list=(List<User>) hu.findAll();
		return list;
	}
    @Override
	public User updateUser(User u) {
		User us=hu.save(u);
		return us;
	}
    @Override
	public void deleteUser(int id) {
		hu.deleteById(id);
	}
	
	
	//Branch
	@Autowired 
	BranchRepository hb;
	
	@Override
	public void saveBranch(Branch br) {
		hb.save(br);
	}
    @Override
	public List<Branch> getBranchdetails() {
		List<Branch> l=(List<Branch>) hb.findAll();
		return l;
	}
    @Override
	public Branch updateBranch(Branch br) {
		Branch b=hb.save(br);
		return b;
	}
    @Override
	public void deleteBranch(int id) {
		hb.deleteById(id);
	}

	//Status
	@Autowired
   StatusRepository hs1;
	
	@Override
	public void savestatus(Status st) {
		hs1.save(st);
	}
    @Override
	public List<Status> getstatusdetails() {
		List<Status> list=(List<Status>) hs1.findAll();
		return list;
	}
    @Override
	public Status updatestatus(Status s) {
		Status stu=hs1.save(s);
		return stu;
	}
   @Override
	public void deletestatus(int id) {
		hs1.deleteById(id);
	}
	
	//Loan_Type
	@Autowired
	Loan_TypeRepository rl;
	
	@Override
	public void savedata(Loan_Type l) {
		rl.save(l);
		}
    @Override
	public List<Loan_Type> getloandetails() {
		List<Loan_Type> list=(List<Loan_Type>) rl.findAll();
		return list;
	}
    @Override
	public Loan_Type updateloan_status(Loan_Type l) {
		Loan_Type l1=rl.save(l);
		return l1;
	}
    @Override
	public void deleteloan_type(int id) {
		rl.deleteById(id);
	}
    
    //Country
    @Autowired
    CountryRepository rc;
    
	@Override
	public void saveCountry(Country c) {
		rc.save(c);
	}
   @Override
	public List<Country> getCountrydetails() {
		List<Country> l=(List<Country>) rc.findAll();
		return l;
	}
   @Override
	public Country updateCountry(Country c) {
		Country cr=rc.save(c);
		return c;
	}
   @Override
	public void deleteCountry(int id) {
		rc.deleteById(id);
	}
	
	//State
	@Autowired
	StateRepository hs;
	
	@Override
	public void saveState(State s) {
		hs.save(s);
	}
   @Override
	public List<State> getStatedetails() {
		List<State> list=(List<State>) hs.findAll();
		return list;
	}
   @Override
	public State updateState(State s) {
		State st=hs.save(s);
		return st;
	}
   @Override
	public void deleteState(int id) {
		hs.deleteById(id);
	}

   //City
	@Autowired 
	CityRepository hc;
	
	@Override
	public void saveCity(City c) {
		
		hc.save(c);
	}
   @Override
	public List<City> getCitydetails() {
		List<City> list=(List<City>) hc.findAll();
		return list;
	}
   @Override
	public City updateCity(City c) {
		City ci=hc.save(c);
		return ci;
	}
   @Override
	public void deleteCity(int id) {
		hc.deleteById(id);
	}
    
	//Role
	@Autowired
	RoleRepository rr;
	
	@Override
	public void saveRole(Role r) {
		rr.save(r);
	}
    @Override
	public List<Role> getRoledetails() {
		List<Role> list=(List<Role>) rr.findAll();
		return list;
	}
    @Override
	public Role updateRole(Role r) {
		Role ro=rr.save(r);
		return ro;
	}
    @Override
	public void deleteRole(int id) {
		rr.deleteById(id);
		
	}

	

	
	

	

}
