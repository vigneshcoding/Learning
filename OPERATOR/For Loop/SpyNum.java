import java.util.Scanner;

public class SpyNum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int LastDigit=0;
        int product=1;
        int sum=0;
        
        while (num>0) {
            LastDigit=num%10;
            sum=sum+LastDigit;
            product=product*LastDigit;
            num=num/10;
        }
        if (sum==product) {
            System.out.println("SpyNum");
        }
        else{
            System.out.println("Not SpyNum");
        }
        
    }
}
