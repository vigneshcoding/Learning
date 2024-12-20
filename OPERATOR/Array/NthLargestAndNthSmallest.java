import java.util.*;

public class NthLargestAndNthSmallest {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[]a={8,4,3,1,7,8,1};
        System.out.println(Arrays.toString(a));
        int []res =removeDup(a);
        System.out.println("\t\t\tSelect the Input : ");
        System.out.println("1.Nth Largest\n2.Nth Smallest");
        int input=sc.nextInt();
        if (input==1) {
            System.out.println("\t\t\tEnter n : ");
            int n=sc.nextInt();
            if (n<res.length) {
                System.out.println(n+" th Largest is : "+res[res.length-n]);
            }else{
                System.out.println("Invaild");
            }
        }else if (input==2) {
            System.out.println("\t\t\tEnter n : ");
            int n=sc.nextInt();
            if (n<res.length) {
                System.out.println(n+" th Smallest is : "+res[n-1]);
            }else{
                System.out.println("Invaild");
            }
        }
    }

    public static int[] removeDup(int[]a){
        Arrays.sort(a);
        int[]b=new int[a.length];
        int x=0;
        for(int i=0;i<a.length-1;i++){
            if (a[i]!=a[i+1]) {
                b[x++]=a[i];
            }
        }
        b[x++]=a[a.length-1];

        int[]res=new int[x];
        for(int i=0;i<res.length;i++){
            res[i]=b[i];
        }
        return res;
    }
}
