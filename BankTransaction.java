class BankTransaction
{
	int currentBalance=10000;//Variable Declaration+Variable Initialization
	int withdrawAmt=2000;
	int depositAmt=3000;	
	
	public void withdraw()//Method Declaration
	{    //Method Implementation
		currentBalance=currentBalance-withdrawAmt;
		System.out.println("After Withdraw...."+currentBalance+withdrawAmt);

	}
	public void deposit()
	{
		currentBalance=currentBalance+depositAmt;
		System.out.println("After Deposit...."+currentBalance);

	}
}

