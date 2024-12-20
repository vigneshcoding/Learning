import java.util.Scanner;
public class FoodApp {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        /*System.out.println("Select the Input");
        System.out.println("1.idly\n2.Dosa\n3.Vada\n4.Pongal");
        int food=sc.nextInt();
        switch (food) {
            case 1:
                {double price=20;
                System.out.println("Idly is "+price);
                break;}
            case 2:
            {double price=45;
            System.out.println("Dosa is "+price);
            break;}
            
            case 3:
            {
                double price=10;
                System.out.println("Vada is "+price);
                break;
            }

            case 4:
            {
                double price=35;
                System.out.println("Pongal is "+price);
                break;
            }
        
            default:
                System.out.println("Invaild Food");
                break;*/
                 
        System.out.println("Select the Skill");
        System.out.println("1.Vignesh\n2.Bala\n3.Asvanth\n4.Asik");
        int skill=sc.nextInt();

        switch (skill) {
            case 1:{
                String name="Vignesh";
                System.out.println("SQL "+name);
                break;
            }
            case 2:{
                String name="Bala";
                System.out.println("Java "+name);
                break;
            }
            case 3:
            {
                String name="Asvanth";
                System.out.println("Python "+name);
                break;
            }
            case 4:
            {
                String name="Asik";
                System.out.println("C# "+name);
                break;
            }
            
        
            default:
            System.out.println("Invaild");
                break;
        }

        }
    }

