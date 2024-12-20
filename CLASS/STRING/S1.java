import java.util.Scanner;

public class S1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter First String : ");
        String s1=sc.nextLine();
        System.out.print("Enter Second String : ");
        String s2=sc.nextLine();

        System.out.println(s1.equals(s2));
    }
}
/*
Note :

    It is Suggested to not Compare String by using '=='
    It is Suggested to Compare String by Using equals(String)
 */
