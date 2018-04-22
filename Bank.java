package com;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {

	private List customers;

	
	private Bank() {
		customers = new ArrayList();
	}
	
	private static Bank bank = new Bank();
	
	public static Bank getBank(){
		return bank;
	}
	

	public void addCustomer(String firstName, String lastName){
		Customer cust = new Customer(firstName, lastName);
		
		customers.add(cust);

	}
	

	public int getNumOfCustomers(){
		return customers.size();
	}
	

	public Customer getCustomer(int index){
		return (Customer)customers.get(index);
	}

	public Iterator getCustomers(){
        Iterator it = customers.iterator();
        return it;
	}
}
