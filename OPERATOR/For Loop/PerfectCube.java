import java.util.Scanner;
public class PerfectCube  {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        String ans= "Not perfect Square";
        for(int i=1;i*i*i<=num;i++){
            if (i*i*i==num) {
                ans="Perfect Cube";
                break;
            }
        }System.out.println(ans);
    }
}

