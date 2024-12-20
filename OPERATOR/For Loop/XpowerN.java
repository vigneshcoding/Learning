import java.util.Scanner;
public class XpowerN {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter X :");
        int X=sc.nextInt();
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++){
             ans=ans*X;
        }
        System.out.println(ans);
    }
}
