import java.util.Scanner;

public class Fibanacci {
    static Scanner sc=new Scanner(System.in);
    static int series,n1=0,n2=1,n3;
    public static void main(String[] args) {
        System.out.print("Enter the Series : ");
        series=sc.nextInt();
        fibo();
    }

    public static void fibo() {
        if (series>0) {
            n3=n1+n2;
            System.out.print(n1+" ");
            series--;
            n1=n2;
            n2=n3;
            fibo();
        }
    }
}