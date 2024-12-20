import java.util.Scanner;
public class T1 { 
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter N:");
       int n=sc.nextInt();

       String res=(n==0)?"Neither Odd Nor Even":(n%2==0)?"Even":"Odd"; //n%2 Any number can divided by this codition its 'Even'
       System.out.println(n+":"+res);
    }
} 