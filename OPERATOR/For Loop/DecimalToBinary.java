import java.util.Scanner;
public class DecimalToBinary {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Num :");
        int num=sc.nextInt();
        int x=1;
        int sum=0;
        for(int i=num;i>0;sum+=i%2*x,i/=2,x*=10){}
        System.out.println("Decimal : "+num);
        System.out.println("Binary : "+sum); 

    }
}
