import java.util.*;

public class BinearSearch {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[]a={8,10,12,16,20,30,32,34,40,43,60,64};
        binearSearch(a);
    }

    public static void binearSearch(int[]a){
        int l=0;
        int h=a.length-1;
        System.out.println(Arrays.toString(a));
        System.out.print("Enter Key : ");
        int key=sc.nextInt();
        String res="Not Present";

        while(l<=h){
            int m=(l+h)/2;
            if (key==a[m]) {
                res="Present";
                break;
            }
            else if (key<a[m]) {
                h=m-1;
            }
            else if (key>a[m]) {
                l=m+1;
            }
        }
        System.out.println(res);
    }
}
