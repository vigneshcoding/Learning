//WAJP to ADD First & Last Number to be qiven.
import java.util.Scanner;
public class FirstAndLast {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int number=sc.nextInt();

        if(number>=0 && number<=9){
            System.out.println("Invaild Don't Enter single Digit");
        }
        else{
        int last=number%10;
        while (number>9) {
            number=number/10;
        }
        int sum=number+last;
        System.out.println(sum);
        }
    }
}
