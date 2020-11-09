package com.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class State 
{
	@Id
private int state_Id;
private String state_Name;
private int state_Code;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="country_id")
private Country country;

public int getState_Id() {
	return state_Id;
}
public void setState_Id(int state_Id) {
	this.state_Id = state_Id;
}
public String getState_Name() {
	return state_Name;
}
public void setState_Name(String state_Name) {
	this.state_Name = state_Name;
}
public int getState_Code() {
	return state_Code;
}
public void setState_Code(int state_Code) {
	this.state_Code = state_Code;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
}
