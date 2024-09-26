import java.util.Scanner;
public class CheckStringIsEmpty {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any String :");
        String s=sc.nextLine();
        if(s.isEmpty()){
                System.out.println("The given string is empty");
        }else{
            System.out.println("The String is not empty");
        }
        sc.close();
    }
}
