package com.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Branch {
	@Id
	private int branch_Id;
	private String branch_Name;
	private String branch_Address;
	private int branch_Code;
	private String branch_IFSC;
	private String branch_ContachNo;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="city_id")
	private City city;
	public int getBranch_Id() {
		return branch_Id;
	}
	public void setBranch_Id(int branch_Id) {
		this.branch_Id = branch_Id;
	}
	public String getBranch_Name() {
		return branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}
	public String getBranch_Address() {
		return branch_Address;
	}
	public void setBranch_Address(String branch_Address) {
		this.branch_Address = branch_Address;
	}
	public int getBranch_Code() {
		return branch_Code;
	}
	public void setBranch_Code(int branch_Code) {
		this.branch_Code = branch_Code;
	}
	public String getBranch_IFSC() {
		return branch_IFSC;
	}
	public void setBranch_IFSC(String branch_IFSC) {
		this.branch_IFSC = branch_IFSC;
	}
	public String getBranch_ContachNo() {
		return branch_ContachNo;
	}
	public void setBranch_ContachNo(String branch_ContachNo) {
		this.branch_ContachNo = branch_ContachNo;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	
	
}
