//Write a Java program to calculate the factorial of a given number.
import java.util.Scanner;
class FactorialOfNumber{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number");
        int a=s.nextInt();
        long mul =1;
        for(int i=a ;i>=1 ;i--){
                mul *=i;
        }
        System.out.println("The Factorial of given number is "+mul);
        s.close();
}
}