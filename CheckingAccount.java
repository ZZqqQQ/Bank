package com;

public class CheckingAccount extends Account{
	private double overdraftProtection;
	
	public CheckingAccount(double init_balance) {
		super(init_balance);
	}
	
	public CheckingAccount(double init_balance, double overdraftProtection){
		super(init_balance);
		this.overdraftProtection = overdraftProtection;
	}
	

	@Override
	public void withdraw(double amt) {
		if(balance >= amt){
			balance -= amt;
		}else{
			if(overdraftProtection >= amt - balance&&overdraftProtection != 0){
				overdraftProtection -= (amt - balance);
				balance = 0;
			}
			else if(overdraftProtection < (amt - balance)&&overdraftProtection != 0){
				throw new OverdraftException("Insufficient funds for overdraft protection",amt - balance);
			}else{
				throw new OverdraftException("no overdraft protection",amt - balance);
			}
		}

	}
	
}
