import java.util.Scanner;
public class TrainingInstituite {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Select Input");
        System.out.println("---------------\n");
        System.out.println("1.Skill\n2.Faculty\n");
        int ip=sc.nextInt();
        System.out.println("Processing.............\n");
        Thread.sleep(3000);

        switch (ip) {
            case 1:
            {
                System.out.println("Select Skill");
                System.out.println("--------------\n");
                System.out.println("1.Java\n2.SQL\n3.WebTech\n4.Testing\n");
                int skill=sc.nextInt();
                System.out.println("Processing..........\n");
                Thread.sleep(3000);

                switch (skill) {
                    case 1:
                    { 
                        String Nm="Tabrez Sir";
                        System.out.println("Java "+Nm);
                        break;
                    }
                    case 2:
                    { 
                        String Nm="Nagaraj Sir";
                        System.out.println("SQL "+Nm);
                        break;
                    }
                    case 3:
                    {
                        String Nm="Sambu Sir";
                        System.out.println("WebTech "+Nm);
                        break;
                    }
                    case 4:
                    {
                        String Nm="Harsha Sir";
                        System.out.println("Testing "+Nm);
                        break;
                    }
                
                    default:
                        System.out.println("Invaild Skill!");
                        break;
                }
                break;
            }
            case 2:
            {
                System.out.println("Select Faculty");
                System.out.println("----------------------\n");
                System.out.println("1.Harsha Sir\n2.Nagaraj Sir\n3.Tabrez sir\n4.Sambu Sir\n");
                int faculty=sc.nextInt();
                System.out.println("Processing..........\n");
                Thread.sleep(3000);


                switch (faculty) {
                    case 1:
                    {
                        String sl="Testing";
                        System.out.println("Harsha Sir "+sl);
                        break;
                    }
                    case 2:
                    {
                        String sl="SQL";
                        System.out.println("Nagaraj Sir "+sl);
                        break;
                    }
                    case 3:
                    {
                        String sl="Java";
                        System.out.println("Tabrez "+sl);
                        break;
                    }
                    case 4:
                    {
                        String sl="WebTech";
                        System.out.println("Sambu "+sl);
                        break;
                    }

                
                    default:
                        System.out.println("No more Faculty");
                        break;
                }
                break;
            }
        
            default:
                System.out.println("Invaild Input");
                break;
        }
    }
}
 