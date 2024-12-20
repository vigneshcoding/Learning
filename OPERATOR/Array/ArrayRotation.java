import java.util.Scanner;
import java.util.Arrays;
public class ArrayRotation {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[]a={10,20,30,40,50};
        rotate(a);
        
    }

    public static int[] rotate(int[]x){

        int[] a;
        System.out.println(Arrays.toString(a));
        System.out.print("Enter N : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int fst=a[0];
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1];
        }
        System.out.println(Arrays.toString(a));
    }
}
