import java.util.Scanner;
class VowelOrConsonant {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Character:");
        char ch=sc.next().charAt(0);

        if (ch>='0' && ch<='9') {
            System.out.println(ch+" is Integer");
        }
        else if (ch>='a' && ch<='z') {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                System.out.println(ch+" is Vowels");
            }
            else{
                System.out.println(ch+" is Consonants");
            }
            
        }
        else if (ch>='A' && ch<='Z') {
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='u'){
                System.out.println(ch+" is Vowels");
            }
            else{
                System.out.println(ch+" is Consonants");
            }
        }
        else
        {
            System.out.println(ch+" is Special Character");
        }
    }
}
