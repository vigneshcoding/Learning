import java.util.Arrays;

public class EvenElement {
    public static void main(String[] args) {
        int[]a={2,3,5,6,8};
        int res=solve(a);
        System.out.print("Enter sum : "+res);
    }
    public static int solve(int[]k){
        System.out.println(Arrays.toString(k));
        int sum=0;
        for(int i=0;i<k.length;i++){
            if(k[i]%2==0){
                sum+=k[i];
            }
        }
        return sum;
    }
}
