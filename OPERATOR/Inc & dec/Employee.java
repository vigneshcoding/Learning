import java.util.Scanner;
/**
 * Employee
 */
public class Employee {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Enter Your id:");
        int eid=sc.nextInt();

        System.out.println("Enter Yourname:");
        String ename=sc.next();

        System.out.println("Enter Your Phno:");
        long cno=sc.nextLong();

        System.out.println("Enter Your salary:");
        double sal=sc.nextDouble();

        System.out.println("Enter Your Gender:");
        char gender=sc.next().charAt(0);
        
        System.out.println("Processing.............");
        Thread.sleep(3000);

        System.out.println("****************Employee Details*******************");
        System.out.println(" Employee Id:"+eid);
        System.out.println(" Employee Name:"+ename);
        System.out.println(" Employee Phno:"+cno);
        System.out.println(" Employee salary:"+sal);
        System.out.println(" Employee Gender:"+gender);

    }
}