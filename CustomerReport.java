package com;

import java.util.Iterator;

public class CustomerReport {
    public void generateReport(){
        Customer customer = null;
        Bank bank = Bank.getBank();
        Iterator it1 = bank.getCustomers();

        while(it1.hasNext()){
            String account_type;
            Account a;
            customer = (Customer) it1.next();
            Iterator ia1 = customer.Accounts();
            System.out.println("Customer :"+customer.getFirstName()+","+customer.getLastName());
            while(ia1.hasNext()){
                a = (Account) ia1.next();
                if(a instanceof SavingAccount){
                   account_type = "SavingAccount";
                }else{ account_type = "CheckingAccount";
                }
                System.out.println(account_type+":Current balance is:"+a.getBalance());
            }
        }
    }
}
