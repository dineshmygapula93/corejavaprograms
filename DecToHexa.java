/**
 * Write a program to convert decimal number to hexadecimal number by using
the following method of java.lang.Integer class.
  public static java.lang.String toHexString(int);
 */
import java.util.Scanner;
public class DecToHexa {
    public static void main(String[] args) {
        System.out.println("Enter any Decimal number :");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        String rs=Integer.toHexString(num);
        System.out.println("The hexadecimal for number "+num+" is "+rs);
        sc.close();
    }
}