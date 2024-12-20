/*import java.util.Scanner;

public class Calculator {
    static Scanner sc=new Scanner(System.in);
    public static int add(int a,int b) {
        return a+b;
    }

    public static int sub(int a,int b) {
        return a-b;
    }

    public static int mul(int a,int b) {
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("Select the Feature");
        System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Exit");
        int input=sc.nextInt();
        boolean flag=true;

        switch (input) {
            case 1:{
                System.out.println("Addition Ans : "+ add(a,b));
                break;}
            case 2:{
                System.out.println("Sub :"+sub(a, b));
                break;}
            case 3:{
                System.out.println("mul : "+mul(a, b));
                break;}
            default:{
                flag=false;
                break;}
        }
        while (flag=false) {
            System.out.println("Thank u for using Calculator");
        }
    }
}
*/

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            System.out.println("Select the Feature");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Exit");
            int input = sc.nextInt();

            if (input == 4) {
                flag = false;
                System.out.println("Thank you for using Calculator");
                break;
            }

            System.out.print("Enter 1st numbers:");
            int a = sc.nextInt();
            System.out.print("Enter 2st numbers:");
            int b = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Addition Ans: " + add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction Ans: " + sub(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication Ans: " + mul(a, b));
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
