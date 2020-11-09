package com.app.mfi.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Role {
	@Id
	private int role_Id;
	private String role_Name;
	private String role_Description;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="status_id")
	private Status status;
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public int getRole_Id() {
		return role_Id;
	}
	public void setRole_Id(int role_Id) {
		this.role_Id = role_Id;
	}
	public String getRole_Name() {
		return role_Name;
	}
	public void setRole_Name(String role_Name) {
		this.role_Name = role_Name;
	}
	public String getRole_Description() {
		return role_Description;
	}
	public void setRole_Description(String role_Description) {
		this.role_Description = role_Description;
	}
	
	

}
