//Write a Java program to check whether given number is strong number or not?
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number");
    int a=s.nextInt();
    int actualnum=a;
    int sum =0;
    int digit =0;
    long mul =1;

    while(a>0){
        digit = a%10;
        a=a/10;
    for(int i=digit ;i>=1 ;i--){
        mul *=i;
    }
    sum +=mul;
    mul =1;
    }
     if (sum==actualnum) {
      System.out.println("The given number "+sum+" is Strong Number");
     }else{
        System.out.println("The given number is not a Strong Number");
     }
     s.close();
 }
}
