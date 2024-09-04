//Write a Java program to display all armstrong numbers in a given range.
import java.util.Scanner;
public class ArmStrongNumberRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start value");
        int num=s.nextInt();
       System.out.println("enter the last values");
        int lastnum =s.nextInt();
       for(int k=num;k<=lastnum ; k++){

            int actual =k ;
            int sum=0;
            int numlen=0;
            int power=1;
        //To check the lenth of the given number
        while(num>0){
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
            sum +=power;
            power=1;
            num=num/10;
        }
        num =actual;
        if(actual == sum)
        System.out.println(actual+" armstrong");
        }
        s.close();
    }
}
