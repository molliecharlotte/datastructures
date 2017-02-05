package lab2;

class SavingsAccount extends Account 
{
	private double interest;
	
	SavingsAccount(double deposit, double interestRate)
	{
		super(deposit);
		interest = interestRate;
	}
	
	SavingsAccount(double interestRate)
	{
		super();
		interest = interestRate;
	}
	
	public double getInterest()
	{
		return interest;
	}
	
	public void setInterest(double rate)
	{
		interest = rate;
	}
	
	public void addInterest()
	{
		balance = balance + balance*interest;
	}
}
