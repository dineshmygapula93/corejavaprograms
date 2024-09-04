//Write a Java program to display fibonacci series.
class FibonacciSeries{
    public static void main(String[] args) {
        long a=0;
        long b=1;
        long sum;
        for(int i=1 ;i<=50 ;i++){
           sum = a+b;
           a=b;
           b=sum;
           System.out.println(sum);
        }
    }
}