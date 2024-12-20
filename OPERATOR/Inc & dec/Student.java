import java.util.Scanner;
public class Student {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.println("Enter Student Id:");
        int sid=sc.nextInt();

        System.out.println("Enter marks:");
        double marks=sc.nextDouble();

        System.out.println("Enter contact:");
        long cno=sc.nextLong();

        System.out.println("Enter Gender:");
        char gender = sc.next().charAt(0);


        System.out.println("Processing...................");
        Thread.sleep(3000);

        System.out.println("Student Id is:"+sid);
        System.out.println("Student Marks is:"+marks);
        System.out.println("Student Contact is:"+cno);
        System.out.println("Student Gender :"+gender);


    }
}
