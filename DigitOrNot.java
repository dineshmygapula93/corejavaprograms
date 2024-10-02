// Write a program to check whether given letter is digit or not by using the following method of java.lang.Character class.public static boolean isDigit(char);
import java.util.Scanner;
public class DigitOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any character");
        String s=sc.nextLine();
        char [] ch=s.toCharArray();
        boolean b=false;
        for (char c : ch) {
            b=Character.isDigit(c);
        }    
        if (b==true) {
            System.out.println("It is a digit");
        }else{
            System.out.println("It is not a digit");
        }
        sc.close();
    }
}
