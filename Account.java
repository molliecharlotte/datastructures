package lab2;

class Account 
{
	protected double balance;
	private int accountNumber;

	Account()
	{
		balance = 0;
	}
	
	Account(double deposit)
	{
		balance = deposit;
	}

    public void deposit(double sum) 
    {
    	balance = balance + sum;
    }

    public void withdraw(double sum)
    {
    	balance = balance - sum;
    }
    
    public double getBalance()
    {
    	return balance;
    }
        
    public void setAccountNumber(int num)
    {
    	accountNumber = num;
    }
    
    public int getAccountNumber()
    {
    	return accountNumber;
    }
}
