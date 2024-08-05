import java.util.Scanner;
public class PrimeNumbersRange {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the prime numbers range");
       int num =s.nextInt();
        for(int a=2 ;a<=num ;a++){
            int flag=0;
           for(int i=2;i<a;i++){
            if(a%i==0){
                flag=1;
            }
            }
            if(flag==0){
                System.out.println(a);
            }
           }
           s.close();
        }
}
