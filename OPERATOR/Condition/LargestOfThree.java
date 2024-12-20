import java.util.Scanner;
public class LargestOfThree {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a:");
        int a=sc.nextInt();

        System.out.println("Enter b:");
        int b=sc.nextInt();

        System.out.println("Enter c:");
        int c=sc.nextInt();

        int res=(a>b && a>c)?a:(b>c)?b:c;

        System.out.println("Result is :"+res);
    }
}
