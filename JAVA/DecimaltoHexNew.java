import java.util.*;
class DecimaltoHexNew
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int num, temp, remainder;
char hexarray[] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
System.out.println("Enter Decimal number: ");
num = sc.nextInt();
String hex = " ";
temp = num;
while(temp > 0)
{
remainder  = temp % 16;
hex = hexarray[remainder] + hex;
temp = temp / 16;
}
System.out.println("HexaDecimal Number is : " +hex);
}
}