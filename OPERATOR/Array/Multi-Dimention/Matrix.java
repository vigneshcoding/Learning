import java.util.*;
public class Matrix {
    static Scanner sc=new Scanner(System.in); 
    public static void main(String[] args)throws Exception {
        int[][] a=new int[4][4];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print("Enter the Element : ");
                a[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        topToBottomRigthToLeft(a);
    }

    public static void topToBottomRigthToLeft(int[][]a) throws Exception{
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                Thread.sleep(300);
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}