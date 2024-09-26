//Write a program to concatenate two strings by using the following method
import java.util.Scanner;
public class ConcatStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String one :");
        String s1=sc.nextLine();
        System.out.print("Enter String two :");
        String s2=sc.nextLine();
        String s3=s1.concat(s2);
        System.out.println(s3);
        sc.close();
    }
}
