
//Write a program to convert lower case letter to upper case letter by usingthe following method of java.lang.Character class.public static char toUpperCase(char);
import java.util.Scanner;
public class LowerToUpper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String :");
        String s=sc.nextLine();
        char [] ch=s.toCharArray();
        for (char c : ch) {
            char c1=Character.toUpperCase(c);
            System.out.print(c1);
        }
        sc.close();
    }
}
