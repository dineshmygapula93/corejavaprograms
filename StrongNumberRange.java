// Write a Java program to display all strong numbers in a given range.
import java.util.Scanner;
public class StrongNumberRange {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstnum = s.nextInt();
        System.out.println("Enter the last number");
        int lastnum = s.nextInt();
        for(int a=firstnum ; a<=lastnum ; a++){
    int actualnum=a;
    int sum =0;
    int digit =0;
    long mul =1;

    while(a>0){
        digit = a%10;
        a=a/10;
    for(int i=digit ;i>=1 ;i--){
        mul *=i;
    }
    sum +=mul;
    mul =1;
    }
     if (sum==actualnum) {
      System.out.println(sum);
     }
     a = actualnum;
        }
        s.close();
}
}
