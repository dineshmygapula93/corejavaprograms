//Write a program to convert decimal number to binary number by using the following method of java.lang.Integer class.public static java.lang.String toBinaryString(int)
import java.util.Scanner;

public class DecToBinary {
 public static void main(String[] args) {
    System.out.println("Enter any Decimal number :");
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    String rs=Integer.toBinaryString(num);
    System.out.println("The Binary for number "+num+" is "+rs);
    sc.close();
        }   
}
