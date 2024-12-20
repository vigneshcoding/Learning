import java.util.Scanner;
public class Test1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter The Number:");
        int Num=sc.nextInt();

        if (Num==0) {
            System.out.println("J2SE");
        }
        else{
            if(Num<0)
            System.out.println("J2EE");
            else
            System.out.println("J2ME");
        }
    }
}
