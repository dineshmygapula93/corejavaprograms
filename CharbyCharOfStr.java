//Write a program to display character by character of given string by using the following method of java.lang.String class.
import java.util.Scanner;
public class CharbyCharOfStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String :");
        String s=sc.nextLine();
        for(int i=0 ; i<s.length() ;i++){
            System.out.println(s.charAt(i));
        }
        sc.close();
    }
}
