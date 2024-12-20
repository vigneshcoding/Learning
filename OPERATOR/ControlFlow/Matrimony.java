import java.util.Scanner;
public class Matrimony {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.println("Welcome to MarkAntony World Maame!\n");

        System.out.println("Select input");
        System.out.println("--------------");
        System.out.println("1.Rashmika\n2.Ninethara\n3.GouriKishan\n4.KeerthiSetti\n");

        int married=sc.nextInt();

        System.out.println("\t\t\t Processing............");
        Thread.sleep(3000);

        if (married==1) {
            System.out.println("Vignesh Weds Rashmika");
        }

        if (married==2) {
            System.out.println("Vignesh Weds Ninethara");
        }

        if (married==3) {
            System.out.println("Vignesh Weds GouriKishan");
        }

        if (married==4) {
            System.out.println("Vignesh Weds KeerthiSetti");
        }

        if (married>4||married<1) {
            System.out.println("Already Married!");
        }
        
    }
}
