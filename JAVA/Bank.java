import java.util.*;
class Bank
{
	int bal=50000;
	int amt;
	int dep, with;
	String username;
	
	Scanner sc=new Scanner(System.in);
	
	void deposit()
	{
		System.out.println("Enter an amount u want to deposit ");
		dep=sc.nextInt();
		
		bal+=dep;
		
		System.out.println("Balance is: "+bal);
	}
	
	void withdraw()
	{
		if(bal< 1000)
		{
			System.out.println("You cannot withdraw... ");
		}
		else
		{
			System.out.println("Enter an amount to withdraw ");
			with=sc.nextInt();
			
			bal=bal-with;
			
			System.out.println("Balance is: "+ bal);
		}
		
	}
	
	void checkbal()
	{
		System.out.println("Balance is: "+bal);
	}
	
	public static void main(String args[])
	{
		System.out.println("1.Deposit \n2.Withdraw \n3.Check Balance \n4.Exit");
		System.out.println("Enter ur choice");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Bank b=new Bank();
		
		switch(n)
		{
			case 1: b.deposit();
					break;
			
			case 2: b.withdraw();
					break;
					
			case 3: b.checkbal();
					break;
					
			case 4: 
					break;
			
			default: System.out.println("Enter proper choice ");
					 break;
		}
	}
}