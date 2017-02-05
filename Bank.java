package lab2;

import java.util.ArrayList;


public class Bank {

	private ArrayList<Account> bank;
	
	public Bank()
	{
		bank = new ArrayList<Account>(0);
	}

    public Account openAccount() 
    {
    	Account a = new Account(bank.size() + 10000);
    	
    	bank.add(a);
    	
    	return a;
    }

    public CheckingAccount openChecking(double balance, double limit) 
    {
    	int account = bank.size() + 10000;
    	
    	CheckingAccount a = new CheckingAccount(balance, limit, account);
    	
    	bank.add(a);
    	
    	return a;
    }

    public SavingsAccount openSavings (double balance, double interest) 
    {
    	int account = bank.size() + 10000;
    	
    	SavingsAccount a = new SavingsAccount(balance, interest, account);
    	
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

}
