package com.app.mfi.master.main.homeservice;

import java.util.List;

import com.app.mfi.master.main.model.Branch;
import com.app.mfi.master.main.model.City;
import com.app.mfi.master.main.model.Country;
import com.app.mfi.master.main.model.Loan_Type;
import com.app.mfi.master.main.model.Role;
import com.app.mfi.master.main.model.State;
import com.app.mfi.master.main.model.Status;
import com.app.mfi.master.main.model.User;

public interface HomeService {
	//User
	public void savedUser(User u);
	public List<User> getUserdetails();
	public User updateUser(User u);
	public void deleteUser(int id);
	
	//Branch
	public void saveBranch(Branch br);
	public List<Branch> getBranchdetails();
	public Branch updateBranch(Branch br);
	public void deleteBranch(int id);
	
	//Loan_Type
	public void savedata(Loan_Type l);
	public List<Loan_Type> getloandetails();
	public Loan_Type updateloan_status(Loan_Type l);
	public void deleteloan_type(int id);
	
	//Status
	public void savestatus(Status st);
	public List<Status> getstatusdetails();
	public Status updatestatus(Status s);
	public void deletestatus(int id);
	
	//Country
	public void saveCountry(Country c);
	public List<Country> getCountrydetails();
	public Country updateCountry(Country c);
	public void deleteCountry(int id);
	
	//State
	public void saveState(State s);
	public List<State> getStatedetails();
	public State updateState(State s);
	public void deleteState(int id);
	
	//City
	public void saveCity(City c);
	public List<City> getCitydetails();
	public City updateCity(City c);
	public void deleteCity(int id);
	
    //Role
	public void saveRole(Role r);
	public List<Role> getRoledetails();
	public Role updateRole(Role r);
	public void deleteRole(int id);
	
	
}
