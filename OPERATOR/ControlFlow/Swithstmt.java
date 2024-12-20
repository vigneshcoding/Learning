/**
 * Swithstmt
 */
import java.util.Scanner;
public class Swithstmt {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
    
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        
        switch (ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':System.out.println(ch+" :is vowel");
            break;
            default:System.out.println(ch+" :is consoent");


            }


    }
}