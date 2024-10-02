//Write a program to check whether given character is lower case letter or notby using the following method of java.lang.Character class.public static boolean isLowerCase(char);
import java.util.Scanner;
public class IsLowerCase {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any letter :");
    String s=sc.nextLine();
    char [] ch=s.toCharArray();
    boolean b=false;
    for (char c : ch) {
        b=Character.isLowerCase(c);
        if(b==false)
        break;
    }
    if (b==true) {
        System.out.println("It has lower case");
    }else{
        System.out.println("It has no lower case");
    }
    sc.close();
 }  
}
