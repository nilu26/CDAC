import java.util.Scanner;
 
public class OctalToDecimalNumber {
    public static void main(String args[]) {
        int oct, dec = 0, i = 0, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Octal Number");
        oct = scanner.nextInt();
        temp = oct;
 
        while (temp != 0) {
            dec = dec + (temp % 10) * (int) Math.pow(8, i);
            i++;
            temp = temp / 10;
        }
 
        System.out.println("Decimal Value : " + dec);
    }
}