import java.util.*;

class Operations{
	public static void main (String[] args){
		
		System.out.println("1.-5+8*6 \n 2.(55+9)%9 \n 3.20+-3*5/8 \n 4.5+15/3*2-8%3");
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Choose Your Option: ");
		int a=sc.nextInt();
		switch(a)
		{
			case 1: System.out.println(-5+8*6);
			
			break;
		
			case 2: System.out.println((55+9)%9);
		
			break;
		
			case 3: System.out.println(20+-3*5/8);
			
			break;
			
			case 4: System.out.println(5+15/3*2-8%3);
			
			break;
			
			default: System.out.println("Enter Valid Option...!");
		}
	}
}