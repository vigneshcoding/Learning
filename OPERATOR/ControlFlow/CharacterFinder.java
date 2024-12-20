import java.util.Scanner;
public class CharacterFinder {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Character:");
        char ch=sc.next().charAt(0);

        if (ch>='0' && ch<='9') {
            System.out.println(ch+" is Integer");
        }
        else if (ch>='a' && ch<='z') {
            System.out.println(ch+"is Lower Alphabet");
        }
        else if (ch>='A' && ch<='Z') {
            System.out.println(ch+"is Upper Alphabet");
        }
        else
        {
            System.out.println(ch+"is Special Character");
        }
    }
}
