import java.util.Scanner;
public class SecondLargest {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 1st No:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd No:");
        int b=sc.nextInt();
        System.out.println("Enter 3rd No:");
        int c=sc.nextInt();

        if ((a>=b&&a<=c)||(a>=c&&a<=b)) {
            System.out.println(a+" is Second Largest ");
        }
        else if ((b>=a&&b<=c)||(b>=c&&b<=a)) {
            System.out.println(b+" is Second Largest");
        }
        else{
            System.out.println(c+" is Second Largest");
        }
    }
}
