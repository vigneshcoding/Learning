import java.util.Scanner;
public class LargestOfFour {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) { 
        System.out.println("Enter A:");
        char a=sc.next().charAt(0);
        System.out.println("Enter B:");
        char b=sc.next().charAt(0);
        System.out.println("Enter C:");
        char c=sc.next().charAt(0);
        System.out.println("Enter D:");
        char d=sc.next().charAt(0);

        if (a>b&&a>c&&a>d) {
            System.out.println("A is Greater");
        }
        else if(b>a&&b>c&&b>d){
            System.out.println("B is Greater");
        }
        else if(c>a&&c>b&&c>d){
            System.out.println("C is Greater");
        }
        else
        {
            System.out.println("D is Greater");
        }



    }
}
