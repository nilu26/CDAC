import java.util.*;
class Tables{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int i;
		System.out.print("Enter a Digit:  ");
		int a=sc.nextInt();
		
		for(i=1;i<=10;i++){
			System.out.println(a+"*"+i+" = " +a*i);
		}
	}
}