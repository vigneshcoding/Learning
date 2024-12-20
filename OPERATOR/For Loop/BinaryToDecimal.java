import java.util.Scanner;
public class BinaryToDecimal {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Binary Number : ");
        int num=sc.nextInt();
        int x=1;
        int sum=0;
        for(int i=num;i>0;sum+=i%10*x,i/=10,x*=2){}
        System.out.println("Binary : "+num);
        System.out.println("Decimal :"+sum);
        
    }
}
