import java.util.Scanner;
public class NatureNum {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
       System.out.println("Enter Number:"); 
       int num=sc.nextInt();
        int sum=0;
       for(int i=1;i<=num;i++){
            sum+=i;
       }
       System.out.println("Result :"+sum);
    }
}
