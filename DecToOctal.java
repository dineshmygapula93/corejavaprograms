//Write a program to convert decimal number to octal number by using the following method of java.lang.Integer class.public static java.lang.String toOctalString(int);

import java.util.Scanner;

public class DecToOctal {
  public static void main(String[] args) {
        System.out.println("Enter any Decimal number :");
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        String rs=Integer.toOctalString(num);
        System.out.println("The octal for number "+num+" is "+rs);
        sc.close();
    }  
}
