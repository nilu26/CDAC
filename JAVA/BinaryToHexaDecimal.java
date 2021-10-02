import java.util.Scanner;
public class BinaryToHexadecimal 
{
   public static void main(String[] args) 
   {
      int [] hex = new int [100];
      int i = 1, j = 0;
      int rem, dec = 0, binary;
 
      System.out.println("Enter binary number");
      Scanner scan = new Scanner(System.in);
      binary = scan.nextInt();
 
      while (binary > 0) 
      {
         rem = binary % 2;
         dec = dec + rem * i;
         i = i * 2;
         binary = binary/10;
      }
      i = 0;
      while (dec != 0)
      {
         hex[i] = dec % 16;
         dec = dec / 16;
         i++;
      }
      System.out.println("Hexadecimal: ");
      for (int k = i-1; k >= 0; k--)
      {
         if(hex[k] > 9)
         {
            System.out.print((char)(hex[k]+55));
         }
         else
         {
            System.out.print(hex[k]);
         }
      }
   }
}