import java.util.Arrays;
public class MissingNumber {
    public static void main(String[] args) {
        int[]a={1,4,6,9};
        findMissing(a);
    }

    public static int[] findMissing(int[] x){
        System.out.println(Arrays.toString(x));
        int j=1;
        for(int i=0;i<x.length;i++,j++){
            if (x[i]!=j) {
                System.out.print(j+" ");
                i--;
            }
        }
        return x;
    }
}
