import java.util.Scanner;

public class Factorial {
    static Scanner sc=new Scanner(System.in);
    static int fact=1;
    public static void main(String[] args) {
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        int res=FindFactorial(n);
        System.out.println("Factotial of "+n+" is "+res);
    }
    public static int FindFactorial(int n) {
        if (n>=2) {
            fact=fact*n;
            n--;
            FindFactorial(n);
        }
        return fact;
    }
}
