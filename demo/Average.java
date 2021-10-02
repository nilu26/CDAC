import java.util.*;

class Average{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number:  ");
		int a=sc.nextInt();
		
		System.out.print("Enter Second Number:  ");
		int b=sc.nextInt();
		
		System.out.print("Enter Third Number:  ");
		int c=sc.nextInt();
		
		int avg=(a+b+c)/3;
		
		System.out.print("Average Of Three Numbers is:  "+avg);
		
	}
}