package com.app.mfi.master.main.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Loan_Type {
	@Id
	
	private int loan_Id;
	private String loan_Type;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="status_id")
	private Status status;
	
	public int getLoan_Id() {
		return loan_Id;
	}
	public void setLoan_Id(int loan_Id) {
		this.loan_Id = loan_Id;
	}
	public String getLoan_Type() {
		return loan_Type;
	}
	public void setLoan_Type(String loan_Type) {
		this.loan_Type = loan_Type;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
	

}
