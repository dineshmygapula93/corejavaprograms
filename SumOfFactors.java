//write java program to display the sum of the factors of a given number

import java.util.Scanner;

public class SumOfFactors {
    public static void main(String[] args) {
        int b=0;
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number:");
        int a=sc.nextInt();
        for(int i=1 ; i<=a ; i++){
            if(a%i==0){
                 b+=i;
            } 
        }  
        System.out.println("The sum of factors is "+b); 
    }
}
