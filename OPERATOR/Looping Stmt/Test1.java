import java.util.Scanner;
public class Test1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        if (num>99) {
            int sum=num%10;
            int mean_sum=0;
            num/=10;
            while (num>9) {
                mean_sum+=num%10;
                num/=10;}

                if ((sum+num)==mean_sum) {
                    System.out.println("Xylem");
                }
                else{
                    System.out.println("Phleom");
                }
            
        }
        else{
            System.out.println("invaild");
        }
        
    }
}
