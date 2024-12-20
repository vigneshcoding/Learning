import java.util.Scanner;
public class Factor {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Number :");
        int Number=sc.nextInt();

        for(int i=1;i<=Number;i++){
            if (Number%i==0) {
                System.out.println("Factors : "+i);
            }
        }
    }
}
