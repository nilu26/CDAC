import java.util.*;

class Swap{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("First Variable:  ");
		int a=sc.nextInt();
		
		System.out.print("Second Variable:  ");
		int b=sc.nextInt();
		
		System.out.println("Before Swap: a = "+a +" and b = "+b);
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("Swap Using 3rd variable: a = "+a +" and b = "+b );
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swap Without 3rd variable: a = "+a +" and b = "+b );
	}
}