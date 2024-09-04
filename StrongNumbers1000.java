//Write a Java program to display all strong numbers from 1 to 1000.
public class StrongNumbers1000 {
    
    public static void main(String[] args) {
        for(int a=1 ; a<=1000 ; a++){
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
}
}
