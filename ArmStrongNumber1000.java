//Write a Java program to display all armstrong numbers from 1 to 1000.
public class ArmStrongNumber1000 {
    public static void main(String[] args) {
        
       for(int num= 1;num<=1000; num++){
            int actual =num ;
            int sum=0;
            int numlen=0;
        //To check the lenth of the given number
        while(num>0){
           numlen++;
           num=num/10;
        }
       num=actual;    
         while(num>0){
            int b = num%10;
            int power=1;
            //To do power of the number
        for(int i=1 ;i<=numlen;i++){
         power *=b;
          }
            sum +=power;
            num=num/10;
        }
        num=actual;
       if(actual == sum)
       System.out.println(actual+" armstrong");
        }
    }
}
