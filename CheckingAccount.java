package lab2;


class CheckingAccount extends Account 
{
	private double overdraft;
	
	CheckingAccount(double deposit, double od, int accNum)
	{
		super(deposit, accNum);
		overdraft = od;
	}
	
	CheckingAccount(double od, int accNum)
	{
		super(accNum);
		overdraft = od;
	}
	
	 public void withdraw(double sum)
	    {
		 double tempBalance = balance - sum;
		 
		 if(tempBalance >= -overdraft)
		  {
	    	balance = balance - sum;
		  }
		  else
		  {
			  System.out.println("Overdraft Limit Reached");
		  }
	    }
	  
	  public boolean isOverdrawn()
	  {
		  if(this.getBalance() <= -overdraft)
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
	  }
}
