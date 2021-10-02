import java.util.*;
class DecimaltoOctalNew
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num, temp, remainder;
char octalarray[] = { '0','1','2','3','4','5','6','7'};
System.out.println("Enter Decimal number: ");
num = sc.nextInt();
String octal = " ";
temp = num;
while(temp > 0)
{
remainder  = temp % 8;
octal  = octalarray[remainder] + octal;
temp = temp / 8;
}
System.out.println("Octal Number is : " +octal);
}
}