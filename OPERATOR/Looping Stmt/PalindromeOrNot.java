import java.util.Scanner;
public class PalindromeOrNot {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int number=sc.nextInt();
        int temp=number;
        int rev=0;
        while (number>0) {
            rev=rev*10+(number%10);
            number/=10;
        }
        String res=(temp==rev)?"Palindrome":"Not Palindrome";
        System.out.println(res);
    }
}
