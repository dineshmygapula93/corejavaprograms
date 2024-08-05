//Write a Java program to display reverse of a given number.
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int a=s.nextInt();
        while(a>0){
            int b=a%10;
            System.out.print(b);
            a =a/10;
        }
        s.close();
    }
}