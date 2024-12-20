import java.util.Scanner;
public class PosOrNeg { 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter N:");
       int n=sc.nextInt();

       String res=(n>0)?"Java":"SQL";
       System.out.println(n+":"+res);
    }
}
