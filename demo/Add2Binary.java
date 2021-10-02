import java.util.*;

class Add2Binary{
	public static void main(String[] args){
		
		int num1,num2;
		int i,b1,b2, sum=0, carry=0;
		int array[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Binary:  ");
		num1=sc.nextInt();
		
		System.out.print("Enter 2nd Binary:  ");
		num2=sc.nextInt();
		
		for(i=array.length-1; i>0; i--){
			b1=num1%10;
			b2=num2%10;
		
			num1=num1/10;
			num2=num2/10;
			
			sum=b1+b2+carry;
			
			if(sum==0){
				array[i]=0;
				carry=0;
			}
			
			else if(sum==1){
				array[i]=1;
				carry=0;
			}
			
			else if(sum==2){
				array[i]=0;
				carry=1;
			}
			
			else if(sum==3){
				array[i]=1;
				carry=1;
			}
		}
		System.out.println("Addition of Two Binary is:  ");
		for(i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
	}	
}