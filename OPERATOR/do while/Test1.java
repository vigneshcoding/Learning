import java.util.Scanner;
public class Test1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag=true;

        do{
            System.out.println("Select the input : ");
            System.out.println("1.Java\n2.SQL\n3.Exit");
            int input=sc.nextInt();
            switch (input) {
                case 1:{
                    System.out.println("Tabrez");
                    break;}
                case 2:{
                    System.out.println("Nagraj");
                    break;}
                case 3:{
                    flag=false;
                    break;}
                default:{break;}
            }
        }while(flag);
        System.out.println("Thank You!");
    }
}
