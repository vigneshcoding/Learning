import java.util.Scanner;

public class SplitStringRotate {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        String s=sc.nextLine();
        String res=rotate(s);
        System.out.println(res);
    }

    public static String rotate(String s){
        String ans="";
        String[]a=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            ans+=a[i]+" ";
        }
        return ans;
    }
}
