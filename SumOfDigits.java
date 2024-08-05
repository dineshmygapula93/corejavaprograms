//Write a Java program to display sum of the digits of a given number.
import java.util.Scanner;
public class SumOfDigits {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number ");
    int a=s.nextInt();
    int c = 0;
    while(a>0){
        int b =a%10;
        a=a/10;
        c +=b;
    }
    System.out.println("Sum of the digits is "+c);
    s.close();
   } 
}
