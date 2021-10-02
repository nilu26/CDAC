// area=pi*r*r
// perimeter=2*pi*r


import java.util.*;

class CircleArea{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Radius of Circle:  ");
		float r=sc.nextFloat();
		final double pi=3.141592653589793238;
		System.out.println("Area is: "+(pi*r*r));
		System.out.println("Perimerter is: "+(2*pi*r));
		
	}
}