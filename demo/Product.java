import java.util.*;

class Product{
	public static void main (String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Input First Number:  ");
		int a=sc.nextInt();
		
		System.out.print("Input Second Number:  ");
		int b=sc.nextInt();
		
		System.out.println("\n Output: " +a+ "x" +b+ "=" +a*b);
	}
}