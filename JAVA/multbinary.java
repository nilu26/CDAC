import java.util.*;
class addbinary
{
	public static void main(String args[])
	{
		int num1, num2;
		int b1,b2,sum=0,carry=0;
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Binary Number: ");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Binary Number: ");
		num2=sc.nextInt();
		
		for(int i=arr.length-1; i>=0; i--)
		{
			b1=num1%10;
			b2=num2%10;
			
			num1=num1/10;
			num2=num2/10;
			
			sum= b1*b2;
			
		}
		System.out.print("Addition of two binary numbers is: ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}
	
}