package com.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class City {
	@Id
	private int city_Id;
	private String city_Name;
	private String city_Code;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="state_id")
	private State state;
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getCity_Id() {
		return city_Id;
	}
	public void setCity_Id(int city_Id) {
		this.city_Id = city_Id;
	}
	public String getCity_Name() {
		return city_Name;
	}
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}
	public String getCity_Code() {
		return city_Code;
	}
	public void setCity_Code(String city_Code) {
		this.city_Code = city_Code;
	}
	
	
	

}
