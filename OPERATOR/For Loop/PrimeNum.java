import java.util.Scanner;
public class PrimeNum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if (n%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");
        }
    }
}
