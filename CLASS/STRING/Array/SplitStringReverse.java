import java.util.Scanner;

public class SplitStringReverse {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        String s=sc.nextLine();
        String ans="";
        String[]a=s.split(" ");
        for(int i=a.length-1;i>=0;i--){
            if (i%2==0) {
                ans=ans+a[i]+"";
            }else{
                ans=ans+reverse(a[i]+"");
            }
        }
        System.out.println(ans);
    }

    public static String reverse(String s){
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
}
