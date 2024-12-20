import java.util.*;
public class Wbt {
    static Scanner sc=new Scanner(System.in);
    static Mobile mobile=new Mobile("Iphone 16 Pro Max","8GB","1TB",25000);
    static Sim sim=new Sim("BSNL","5G",500);
    public static void main(String[] args) {
        boolean my_features=true;
        System.out.println("\t\t\tWelcome To Sim Tracker");
        do{
            System.out.println("1.Insert sim\n2.Remove Sim\n3.Details of Mobile\n4.Details of Sim\n5.Exit");
            System.out.print("\n\t\t\tSelect Your Choice : ");
            int input=sc.nextInt();
            switch (input) {
                case 1:
                    mobile.insertSim(sim);
                    break;
            
                case 2:
                    mobile.removeSim();
                    break;
                
                case 3:
                    mobile.detailsOfMobile();
                    break;
                
                case 4:
                    sim.detailsOfSim();
                    break;
                
                case 5:
                    my_features=false;
                    break;
            }
        }
        while(my_features);
        System.out.println("\t\t\t****Thank You****");
    }
}
