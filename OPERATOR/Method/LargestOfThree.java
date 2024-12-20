import java.util.Scanner;

public class LargestOfThree {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter A : ");
        int a=sc.nextInt();
        System.out.print("Enter B : ");
        int b=sc.nextInt();
        System.out.print("Enter C : ");
        int c=sc.nextInt();

        int res=LargestOfThree(a, b, c);
        System.out.println("largestOfThree "+res);
    }

    public static int LargestOfThree(int a,int b,int c) {
        if(a>b){
            if(a>c){
                return a;
            }
            else{
                return c;
            }
        }
        else if (b>c) {
            return b;
        }
        return c;
    }
}
