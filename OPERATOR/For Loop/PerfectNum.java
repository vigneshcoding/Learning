import java.util.Scanner;
public class PerfectNum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        int sum=0;

        for(int i=1;i<num;i++){
            if (num%i==0) {
                sum+=i;
            }
        }
        if (sum==num) {
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }
    }
}
