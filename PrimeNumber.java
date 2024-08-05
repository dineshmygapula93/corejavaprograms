//Write a java program to check whether the ginen  number is prime or not

import java.util.Scanner;

public class PrimeNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
     int flag=0;
        if(a==0 || a==1){
            System.out.println("It is not a prime number");
        }else{
            for(int i=2 ;i<a ;i++){
              if(a%i==0){
              System.out.println("It is not a prime number");
              flag=1;
              }
           
        }
    }
    if(flag==0){
        System.out.println("It is a prime number");
    }
    
    sc.close();
   } 
}
