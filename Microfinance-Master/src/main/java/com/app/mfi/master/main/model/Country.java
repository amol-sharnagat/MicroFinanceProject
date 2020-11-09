package com.app.mfi.master.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country 
{
	@Id
     private int country_Id;
	 private String country_Name;
	 private int country_Code;
 public int getCountry_Id() {
		return country_Id;
	}
	public void setCountry_Id(int country_Id) {
		this.country_Id = country_Id;
	}
	public String getCountry_Name() {
		return country_Name;
	}
	public void setCountry_Name(String country_Name) {
		this.country_Name = country_Name;
	}
	public int getCountry_Code() {
		return country_Code;
	}
	public void setCountry_Code(int country_Code) {
		this.country_Code = country_Code;
	}

}
