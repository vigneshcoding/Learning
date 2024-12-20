import java.util.Scanner; 
public class Restaurant {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select Hotel \n");
        System.out.println("Select Input");
        System.out.println("-------------");
        System.out.println("1.A2B \n 2.Buhari \n");
         
        int Hotel=sc.nextInt();

        if (Hotel==1) {
            System.out.println("Getting into A2B");
            System.out.println("1.Idly \n 2.Dosa \n");
            int food=sc.nextInt();
            if (food==1) {
                System.out.println("Idly : 80");
            }
            if (food==2) {
                System.out.println("Dosa : 70");
            }
            if (food>2||food<1) {
                System.out.println("Invaild Food Selection");
            }
        }

        if (Hotel==2) {
            System.out.println("Getting into Buhari");
            System.out.println("1.Chicken Biriyani \n 2.Mutton Biriyani \n");
            int food1=sc.nextInt();
            if (food1==1) {
                System.out.println("C.Biriyani : 380");
            }
            if (food1==2) {
                System.out.println("M.Biriyani : 900");
            }
            if (food1>2||food1<1) {
                System.out.println("Invaild Food Selection");
            }
        }


    }
}
