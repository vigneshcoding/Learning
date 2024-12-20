import java.util.Scanner;
public class FindDigits {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        int number=sc.nextInt();
        int count=0;

        while (number>0) {
            number/=10;
            count++;    
        }
        System.out.println("Total Digits : "+count);

    }
}
