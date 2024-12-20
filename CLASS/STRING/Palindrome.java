import java.util.Scanner;

public class Palindrome {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the String : ");
        String res=(isPalindrome(sc.nextLine()))?"Palindrome":"Not Palindrome";
        System.out.println(res);
    }

    public static boolean isPalindrome(String s){
        String rev="";

        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }

        if (s.equals(rev)) 
            return true;
        else
            return false;
        
    }
}
/*
  EqualIgnoreCase is use to compare Current String And Past String by Ignoring the Case
    -The Return type is Boolean
 */