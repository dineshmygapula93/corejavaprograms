//Write a Java program to display digits of a given number.
import java.util.Scanner;
public class DigitsOfNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=s.nextInt();
        while(a>0){
        int b = a%10;
            System.out.println(b);
            a=a/10;
        }   
        s.close();
    }
}
