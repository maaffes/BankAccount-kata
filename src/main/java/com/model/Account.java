package com.model;

import java.sql.Date;
import java.util.List;

/**
 * 
 * @author affes
 *
 */
public class Account {

	private long idAccount;
	private double amount;
	private double balance;
	private List<String> history;
	private Date dateCreate;	 	
	public long getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(long idAccount) {
		this.idAccount = idAccount;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public Date getDateCreate() {
		return dateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}
	public List<String> getHistory() {
		return history;
	}
	public void setHistory(List<String> history) {
		this.history = history;
	}
	public Account(long idAccount, double amount, double balance, List<String> history) {
		super();
		this.idAccount = idAccount;
		this.amount = amount;
		this.balance = balance;
		this.history=history;
	}

	
	

}
