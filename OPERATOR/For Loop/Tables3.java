import java.util.Scanner;
public class Tables3 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter Start : ");
        int start=sc.nextInt();
        System.out.print("Enter End : ");
         int end=sc.nextInt();

        for(int i=1;i<=100;i++){
            for(int j=start;j<=end;j++){
                System.out.print(j+"X"+i+"="+(j*i)+"\t\t");
            }
            System.out.println();
        }
    }
}
