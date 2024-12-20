import java.util.Scanner;
public class PosOrNegOrEq { 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("\t\t\t Enter N:");
       int n=sc.nextInt();

       String res=(n==0)?"Hero":(n>0)?"Java":"SQL";
       System.out.println(n+":"+res);
    }
}
