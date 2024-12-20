import java.util.Scanner;
public class OddOrEven {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The Number:");
        int Sum=sc.nextInt();

        if (Sum==0) {
            System.out.println("Neither Even Nor odd");
        }
        else{
            if (Sum%2==0) {
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
