import java.util.*;
public class Rectangle{
	
	public static void main(String args[]) {
		
		double width,height,area,perimeter;
		Scanner sc = new Scanner(System.in);
		System.out.print("Width = ");
		width = sc.nextDouble();
		System.out.print("Height = ");
		height = sc.nextDouble();
		area = width * height;
		System.out.println("area  is = " + area);
		perimeter = 2*(height + width);
		System.out.println("Perimeter is = " + perimeter);
	}
}