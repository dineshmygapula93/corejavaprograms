import java.util.Scanner;
public class StrToCharArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        char[] c =s.toCharArray();
        
        System.out.println(c[0]);
        sc.close();
    }
}
