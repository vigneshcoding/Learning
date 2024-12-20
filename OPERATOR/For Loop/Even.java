import java.util.Scanner;
public class Even {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Start:");
        int Start=sc.nextInt();

        System.out.println("Enter End:");
        int end=sc.nextInt();
        for(int i=Start;i<=end;i++){
            if(i%2==0){
                System.out.println("Even : "+i);
            }else{
                System.out.println("Odd :"+i);
            }
        }   
    }
}
