import java.util.*;
public class LinearSearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[]a={8,11,12,4,3,2,24,28,27,38};
        linearSearch(a);
    }

    public static void linearSearch(int[]a){
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the Element : ");
        int key=sc.nextInt();

        String res="Not Present";
        for(int i=0;i<a.length;i++){
            if (a[i]==key) {
                res="Present";
                break;
            }
        }
        System.out.println(res);
    }
}