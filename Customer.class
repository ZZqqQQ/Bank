package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
	
	private String firstName;
	private String lastName;

	private List accounts;

	private int numberOfAccounts;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		accounts = new ArrayList();
	}

	public Account getAccount(int index) {
		return (Account) accounts.get(index);
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public int getNumOfAccounts(){
		return accounts.size();
	}

	public Iterator Accounts(){
		Iterator ia = accounts.iterator();
		return ia;
	}
}
