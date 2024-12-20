import java.util.Scanner;

public class Factorial {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        int fact=1;
        for(int i=num;i>=2;i--){
            fact*=i;
        }
        System.out.println(fact);
    }
}
