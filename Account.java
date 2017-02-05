package lab2;

class Account 
{
	protected double balance;
	private int accountNumber;

	Account(int accNum)
	{
		balance = 0;
		accountNumber = accNum;
	}
	
	Account(double deposit, int accNum)
	{
		balance = deposit;
		accountNumber = accNum;
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
    
    public int getAccountNumber()
    {
    	return accountNumber;
    }
}
