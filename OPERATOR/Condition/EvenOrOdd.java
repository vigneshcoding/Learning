import java.util.Scanner;
public class EvenOrOdd {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter N:");
       int n=sc.nextInt();

       String res=(n%2==0)?"Vijay":"Ajith";
       System.out.println(res);
    }
}