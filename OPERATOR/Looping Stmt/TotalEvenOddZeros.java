//Wajp to count total Even , odd, zeros 
import java.util.Scanner;;
public class TotalEvenOddZeros {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enther the Number:");
        int number=sc.nextInt();
        int C_Count=0;
        int O_Count=0;
        int Z_Count=0;
        while (number>0) {
            if (number%10==0)
                Z_Count++;
            else if (number%2==0) 
                C_Count++;
            else
                O_Count++;
                number/=10; 
        }
            System.out.println("Total Zeros : "+C_Count);
            System.out.println("Total Even  : "+O_Count);
            System.out.println("Total Odd   : "+Z_Count);
    }
}
