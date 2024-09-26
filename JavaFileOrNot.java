//Write a program to check whether given file is Java file or not by using the following method of java.lang.String class.
public class JavaFileOrNot {
    public static void main(String[] args) {
      if (args.length == 0) {
        System.out.println("Please provide a filename as an argument.");
        return;
    }
     String s1= args[0];
      if(s1.endsWith(".java")){
        System.out.println("It is a java file");
      }else{
        System.out.println("It is not a java file");
      }
}
}
