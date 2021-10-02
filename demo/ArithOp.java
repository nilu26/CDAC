import java.util.*;

class ArithOp{
	public static void main (String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input First Number:  ");
		int a=sc.nextInt();
		
		System.out.print("Input Second Number:  ");
		int b=sc.nextInt();
		
		System.out.println("Output: ");
		
		System.out.println(a+ " + " +b+ " = " +(a+b));
		
		System.out.println(a+ " - " +b+ " = " +(a-b));
		
		System.out.println(a+ " * " +b+ " = " +(a*b));
		
		System.out.println(a+ " / " +b+ " = " +(a/b));
		
		System.out.println(a+ " mod " +b+ " = " +(a%b)	);
		
	}
}