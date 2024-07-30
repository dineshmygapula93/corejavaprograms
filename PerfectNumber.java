// write a java program to check whether the given number is perfect number or not?

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
          int b=0;
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=sc.nextInt();
        for(int i=1 ; i<a ; i++){
            if(a%i==0){
                 b+=i;
            } 
        }  
        if(a==b)
        System.out.println("The given number "+a+" is a perfect number ");
        else
        System.out.println("It is not a perfect number");
        sc.close();
    }
}
