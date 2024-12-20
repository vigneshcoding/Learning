import java.util.Scanner;
public class Swiggy {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Swiggy......!\n");
        System.out.println("Select the Hotel");
        System.out.println("----------------------\n");
        System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.Appa Canteen\n");
        int hotel=sc.nextInt();

        switch (hotel) {
            case 1:{
                System.out.println("\t\t\tGetting into Buhari");
                System.out.println("Select Menu");
                System.out.println("----------------");
                System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.Chicken 65\n");
                int food=sc.nextInt();

                switch (food) {
                    case 1:{
                        double price=180;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1) {
                                System.out.println("Gpay - 1" +sys_bill);
                                System.out.println("Connect Gpay server............\n");
                            
                                Thread.sleep(3000);
                                
                                int sys_otp=(int)(Math.random()*9999+9999);
                                System.out.println("Your otp is "+sys_otp);
                                System.out.println("Enter Otp :\n");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(3000);
                            
                                if (user_enter_otp==sys_otp){
                                    System.out.println("Payment sucessful your Order will Delivery within 5min....!");}
                                else{
                                    System.out.println("Payment Faild");}
                                }
                                if (pay==2) {
                                    System.out.println("Phonepe - " +sys_bill);
                                    System.out.println("Connect Phonepe server............");
                            
                                    Thread.sleep(3000);
                            
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    System.out.println("Your otp is "+sys_otp);
                                    System.out.println("Enter Otp :\n");
                                    int user_enter_otp=sc.nextInt();
                                    Thread.sleep(3000);
                                
                                    if (user_enter_otp==sys_otp){
                                        System.out.println("Payment sucessful your Order will Delivery within 5min....!");}
                                    else{
                                        System.out.println("Payment Failded");}  
                                }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }
                        
                        break;}
                    case 2:{
                        double price=130;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1) {
                                System.out.println("Gpay - 1" +sys_bill);
                                System.out.println("Connect Gpay server............\n");
                            
                                Thread.sleep(3000);
                                
                                int sys_otp=(int)(Math.random()*9999+9999);
                                System.out.println("Your otp is "+sys_otp);
                                System.out.println("Enter Otp :\n");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(3000);
                            
                                if (user_enter_otp==sys_otp){
                                    System.out.println("Payment sucessful your Order will Delivery within 5min....!");}
                                else{
                                    System.out.println("Payment Faild");}
                                }
                                if (pay==2) {
                                    System.out.println("Phonepe - " +sys_bill);
                                    System.out.println("Connect Phonepe server............");
                            
                                    Thread.sleep(3000);
                            
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    System.out.println("Your otp is "+sys_otp);
                                    System.out.println("Enter Otp :\n");
                                    int user_enter_otp=sc.nextInt();
                                    Thread.sleep(3000);
                                
                                    if (user_enter_otp==sys_otp){
                                        System.out.println("Payment sucessful your Order will Delivery within 5min....!");}
                                    else{
                                        System.out.println("Payment Failded");}  
                                }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    case 3:{
                        double price=100;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1) {
                                System.out.println("Gpay - 1" +sys_bill);
                                System.out.println("Connect Gpay server............\n");
                            
                                Thread.sleep(3000);
                                
                                int sys_otp=(int)(Math.random()*9999+9999);
                                System.out.println("Your otp is "+sys_otp);
                                System.out.println("Enter Otp :\n");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(3000);
                            
                                if (user_enter_otp==sys_otp){
                                    System.out.println("Payment sucessful your Order will Delivery within 5min....!");}
                                else{
                                    System.out.println("Payment Faild");}
                                }
                                if (pay==2) {
                                    System.out.println("Phonepe - " +sys_bill);
                                    System.out.println("Connect Phonepe server............");
                            
                                    Thread.sleep(3000);
                            
                                    int sys_otp=(int)(Math.random()*9999+9999);
                                    System.out.println("Your otp is "+sys_otp);
                                    System.out.println("Enter Otp :\n");
                                    int user_enter_otp=sc.nextInt();
                                    Thread.sleep(3000);
                                
                                    if (user_enter_otp==sys_otp){
                                        System.out.println("Payment sucessful your Order will Delivery within 5min....!");}
                                    else{
                                        System.out.println("Payment Failded");}  
                                }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    default:
                        System.out.println("Invaild Menu...!\n");
                        break;
                }
                break;}

            case 2:{
                System.out.println("\t\t\tGetting into A2B");
                System.out.println("Select Menu");
                System.out.println("----------------");
                System.out.println("1.Idly\n2.Dosa\n3.Pongal\n");
                int food=sc.nextInt();

                switch (food) {
                    case 1:{
                        double price=10;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }
                        
                        break;}
                    case 2:{
                        double price=40;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    case 3:{
                        double price=60;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    default:
                        System.out.println("Invaild Menu...!\n");
                        break;
                }
                break;}

            case 3:{
                System.out.println("\t\t\tGetting into Amma Canteen");
                System.out.println("Select Menu");
                System.out.println("----------------");
                System.out.println("1.Idly\n2.Dosa\n3.Vada\n");
                int food=sc.nextInt();

                switch (food) {
                    case 1:{
                        double price=1;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }
                        
                        break;}
                    case 2:{
                        double price=3;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    case 3:{
                        double price=2;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    default:
                        System.out.println("Invaild Menu...!\n");
                        break;
                }
                break;}
            case 4:{
                System.out.println("\t\t\tGetting into Appa Canteen");
                System.out.println("Select Menu");
                System.out.println("----------------");
                System.out.println("1.Sambar Sathem\n2.Thaier Sathem\n3.Lemon Satham\n");
                int food=sc.nextInt();

                switch (food) {
                    case 1:{
                        double price=5;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }
                        
                        break;}
                    case 2:{
                        double price=3;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    case 3:{
                        double price=10;
                        System.out.println("\nSelect the Qty :");
                        int qty=sc.nextInt();
                        Thread.sleep(2000);

                        double sys_bill=qty*price;
                        System.out.println("\nTotal bill is : "+sys_bill);
                        Thread.sleep(3000);
                        System.out.println("\n1.Continue\n2.Exit\n");
                        int confirm=sc.nextInt();
                        Thread.sleep(3000);

                        if (confirm==1) {
                            System.out.println("\n1.Gpay\n2.Phonepe");
                            System.out.println("\nSelect Payment Mode :");
                            int pay=sc.nextInt();

                            if (pay==1||pay==2) {
                                String paymentMethod=(pay==1)?"Gpay":"Phonepe"; //Payment Method Condition
                                Thread.sleep(3000);
                                System.out.println(paymentMethod+" - "+sys_bill);
                                Thread.sleep(2000);
                                System.out.println("\nConnecting to "+paymentMethod+" Server.........");
                                Thread.sleep(3000);

                                int sys_otp=(int)(Math.random()*9999+9999); //Otp generation code
                                System.out.println("\nYour OTP is : "+sys_otp); 
                                Thread.sleep(2000);

                                System.out.println("Enter the OTP:");
                                int user_enter_otp=sc.nextInt();
                                Thread.sleep(2000);

                                if (user_enter_otp==sys_otp) {
                                    System.out.println("\nPayment Successed....");
                                    Thread.sleep(2000);
                                    System.out.println("\nYour Order Delivery Within 10min....!\n");
                                }
                                else{
                                    System.out.println("Wrong OTP Payment Failed....!\n");
                                }
                            }
                            else{
                                System.out.println("Invaild Payment Mode..!\n");
                            }

                        }
                        else{
                            System.out.println("Exiting....!\n");
                        }

                        break;}
                    default:
                        System.out.println("Invaild Menu...!\n");
                        break;
                }
                break;}
            default:
                System.out.println("Invaild Hotel..!");
                break;
        }
    }
}
