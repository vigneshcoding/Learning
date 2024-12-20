import java.util.Scanner;
public class Hotel {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception{
        boolean hotel=true;
        do{
            System.out.println("Select the Hotel");
            System.out.println("1.Buhari\n2.Exit");
            int input=sc.nextInt();
            switch (input) {
                case 1:{
                    boolean menu=true;
                    System.out.println(">>>>Redircting to buhari......");
                    Thread.sleep(3000);
                    do{
                        System.out.println("Getting into Buhari");
                        System.out.println("Select the food");
                        System.out.println("1.Briyani\n2.GheeRice\n3.Exit");
                        int food=sc.nextInt();
                        switch (food) {
                        case 1:{
                            System.out.println("Briyani : 380");
                            break;}
                        case 2:{
                            System.out.println("GheeRice : 180");
                            break;}
                        case 3:{
                            menu=false;
                            break;}
                    
                        default:{break;}
                        }
                    }while(menu);
                    System.out.println("<<<<<<<Redirecting to Home Page...");
                    Thread.sleep(2000);
                    break;}
                case 2:{
                    hotel=false;
                    break;}
                default:{break;}
            }
        }while(hotel);
        System.out.println("\t\t\t\tThank You...!");
    }
    
}