import java.util.Scanner;
public class LargestOfTwo {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("enter a:");
       int a=sc.nextInt();
       System.out.println("enter b:");
       int b=sc.nextInt();

       int res=(a>b)?a:b;
       System.out.println("largest is:"+res);
    }
}
