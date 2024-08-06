//write a java program to display all perfect numbers of given range
import java.util.Scanner;
public class PerfectNumberRange {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter start value");
    int start=sc.nextInt();
    System.out.println("enter the last value ");
    int r=sc.nextInt();
    for(int num=start;num<=r ;num++)
    {
        int sum =0;
         for(int i=1 ; i<=num/2 ; i++)
         {
             if(num%i==0)
            {
                sum+=i;
            }
         }
      if(sum == num)
      {
        System.out.println(num);
      }
    }
   sc.close();
}
}