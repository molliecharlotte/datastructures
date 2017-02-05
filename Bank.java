package lab2;

import java.util.ArrayList;
import java.util.List;


public class Bank {

	private String name;
	private ArrayList<Account> bank;
	
	public Bank(String bankName)
	{
		name= bankName;
		bank = new ArrayList<Account>(0);
	}

    public Account openAccount() 
    {
    	Account a = new Account();
    	
    	bank.add(a);
    	
    	return a;
    }

    public CheckingAccount openChecking(double balance, double limit) 
    {
    	CheckingAccount a = new CheckingAccount(balance, limit);
    	
    	bank.add(a);
    	
    	return a;
    }

    public SavingsAccount openSavings (double balance, double interest) 
    {
    	SavingsAccount a = new SavingsAccount(balance, interest);
    	
    	bank.add(a);
    	
    	return a;
    }
    
    public void updateAll() 
    {
    	for(int i=0; i < bank.size(); i++)
    	{
    		if(bank.get(i) instanceof SavingsAccount)
    		{
    			((SavingsAccount) bank.get(i)).addInterest();
    		}
    		else if(bank.get(i) instanceof CheckingAccount)
    		{
    			if(((CheckingAccount) bank.get(i)).isOverdrawn() == true)
    			{
    				System.out.println("Your account is overdrawn.");
    			}
    		}
    	}
    }
    
    public String getBankName()
    {
    	return name;
    }

    public Account getAccount(int accountNumber) 
    {
       for(int i=0; i < bank.size(); i++)
       {
    	   if(bank.get(i).getAccountNumber() == accountNumber)
    	   {
    		   return bank.get(i);
    	   }
       }
       
       return null;
    }
    
    public int getNumAccounts()
    {
    	return bank.size();
    }
}
