// Write a program to split words with specified delimiter in a given string  by using the following method of java.lang.String class.public java.lang.String[] split(java.lang.String)
import java.util.Scanner;
public class SplitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        String [] sp =s.split(" ");
        for (String str : sp) {
            System.out.println(str);
        }
        sc.close();
    }
}
