package com.capgemini.pecunia.addaccount.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="Account")	
public class Account {
	@Id   
	@Column(length=12)  
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="genName1")
	@SequenceGenerator(name="genName1", sequenceName="acc",initialValue=1000000000,allocationSize=1)
	private long accountId;
	@Column(length=15)
	private String branch;
	@Column(length=15)
	private String accountType;
	@Column(length=8)
	private long amount;
	
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
		
	
}
