//Write a Java program to check whether given number is an armstrong or not?
import java.util.Scanner;
public class ArmStrongNumber {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=s.nextInt();
        int actual = num;
        int sum=0;
        int numlen=0;
        int power=1;
        //To check the lenth of the given number
        while(num>0){
           int r = num%10;
           numlen++;
           num=num/10;
        }
       num=actual;
         while(num>0){
            int b = num%10;
            //To do power of the number
        for(int i=1 ;i<=numlen;i++){
         power *=b;
        }
        System.out.println(power);
            sum +=power;
            power=1;
            num=num/10;
        }
        if(actual == sum)
        System.out.println("the number "+actual+" is Armstrong number");
        else
        System.out.println("it is not a Armstrong Number");
        s.close();
    }
}
