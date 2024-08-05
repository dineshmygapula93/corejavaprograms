public class PrimeNumbers1000 {
    public static void main(String[] args) {
       
        for(int a=2 ;a<=1000 ;a++){
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
        }
    }

