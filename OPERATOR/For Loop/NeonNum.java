import java.util.Scanner;
public class NeonNum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        int Square=num*num;
        int LastDigit=0;
        int sum=0;
        
        while(Square>0){
            LastDigit=Square%10;
            sum=sum+LastDigit;
            Square=Square/10;
        }
        if (sum==num) {
            System.out.println("NeonNum");
        }else{
            System.out.println("Not NeonNum");
        }
    } 
}
