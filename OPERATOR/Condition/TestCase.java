import java.util.Scanner;
public class TestCase {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Sub1:");
        int a=sc.nextInt();

        System.out.println("Enter Sub2:");
        int b=sc.nextInt();

        System.out.println("Enter Sub1:");
        int c=sc.nextInt();

        System.out.println("Enter Sub4:");
        int d=sc.nextInt();

        System.out.println("Enter Sub5:");
        int e=sc.nextInt();

        int per=(a+b+c+d+e)/5;

        int res=(per>90 && per>100)?A:(per>80 && per>89)?B:(per>70 && per>79)?C:(per>60 && per>69)?E:(per>60)?F;

        System.out.println(per+":"+res);

    }
}
