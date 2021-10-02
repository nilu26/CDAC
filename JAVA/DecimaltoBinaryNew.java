import java.util.*;
class DecimaltoBinaryNew
{
public static void main(String args[])
{
int decimal , temp, remainder;
String binary = " ";
Scanner sc = new Scanner(System.in);
System.out.print("Enter Decimal value: ");
decimal  = sc.nextInt();
temp = decimal;
while(temp  > 0)
{
remainder = temp % 2;
temp = temp / 2;
binary = remainder + binary;
}
System.out.print(" Binary Number is: " +binary);
}
}

dec = 9                                                 8   4   2  1
                                                                   1 0 0 1 
temp = 9
rem = 1
temp = 4 2  1

 

