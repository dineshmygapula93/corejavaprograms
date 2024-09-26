// Write a program to check whether given string starts with "w" or not by using the following method of java.lang.String class.
import java.util.Scanner;
public class StartStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String :");
        String s=sc.nextLine();
        if(s.startsWith("w")){
                System.out.println("The given string starts with w");
        }else{
            System.out.println("The String is not starts with w");
        }
    }
}