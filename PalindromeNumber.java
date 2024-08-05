//Write a Java program to check whether given number is palindrome or not?
import java.util.Scanner;
public class PalindromeNumber {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number :");
    int a=s.nextInt();
    int b=0,sum=0;
    int temp=a;
    while(a>0){
         b=a%10;
         sum=(sum*10)+b;
         a=a/10;
      
    }
    if(temp==sum){
        System.out.println("It is the palindrome");
    }else{
        System.out.println("It is not a palindrome");
    }
    s.close();
}
}