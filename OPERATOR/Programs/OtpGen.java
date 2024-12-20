import java.util.Scanner;
class OtpGen{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Otp:");
        int sys_otp=(int)(Math.random()*9999+9999);

        System.out.println(sys_otp);
        int user_enter_otp=sc.nextInt();
        if (user_enter_otp==sys_otp)
            System.out.println("Verifation sucess");
        else
            System.out.println("Verifation Faild");
        
    }
}