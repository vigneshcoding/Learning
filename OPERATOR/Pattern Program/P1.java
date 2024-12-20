import java.util.Scanner;
public class P1 {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Enter Rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter Columns : ");
        int columns=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print("* ");
                Thread.sleep(50);
            }
            System.out.println();
        }
    }
    
}