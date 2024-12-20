import java.util.Arrays;

public class AlphabetValue {
    public static void main(String[] args) {
        char[]a={'A','B','C','D'};
        int[]res=solve(a);

        System.out.println(Arrays.toString(res));
    }
    public static int[] solve(char[]x){
        int[] b=new int[x.length];
        for(int i=0;i<x.length;i++){
            b[i]=x[i];
        }
        return b;
    }
}
