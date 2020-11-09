package com.app.mfi.master.main.model;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Status {
	@Id
	
	private int status_Id;
	private String status_Discription;
	
	public int getStatus_Id() {
		return status_Id;
	}
	public void setStatus_Id(int status_Id) {
		this.status_Id = status_Id;
	}
	public String getStatus_Discription() {
		return status_Discription;
	}
	public void setStatus_Discription(String status_Discription) {
		this.status_Discription = status_Discription;
	}
	
	

}
