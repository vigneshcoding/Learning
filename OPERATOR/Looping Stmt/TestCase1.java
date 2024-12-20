import java.util.Scanner;
public class TestCase1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select the Input");
        System.out.println("--------------------");
        System.out.println("1.Print A-Z\n2.Print a-z\n3.Print 100-1");
        int ip=sc.nextInt();
        
     
        switch (ip) {
            case 1:{
                char ch='A';
                while (ch<='Z') {
                    System.out.println(ch++ + " ");
                }
                break;}
            case 2:{
                char ch='a';
                while (ch<='z') {
                    System.out.println(ch++ + " ");
                }
                break;}
            case 3:{
                int num=100;
                while (num>=1) {
                    System.out.println(num-- + " ");
                }
                break;}
        
            default:
                {break;}
             
        }
                /*
        if (ip==1) {
            char ch='A';
            while (ch<='Z') {
                System.out.println(ch++ +" ");
            }
        }
        else if (ip==2) {
            char ch='a';
            while (ch<='z') {
                System.out.println(ch++ +" ");
            }
        }
        else if (ip==3) {
            int num=100;
            while (num>=1) {
                System.out.println(num-- +" ");
            }
        }
        else{
            System.out.println("invalid");
        }*/
    }
}
