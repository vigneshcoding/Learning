import java.util.Arrays;
public class A1 {
    public static void main(String[] args) {
        int[]a={1,0,1,0,0,1,1,1,0};
        int[]res=merge(a);

        System.out.println(Arrays.toString(res));

    }

    public static int[] merge(int[]x){
        int count=0;
        for(int i=0;i<x.length;i++){
            if (x[i]==1) {
                count++;
            }
            else if (i<count) {
                x[i]=1;
            }
            else if (i>=count) {
                x[i]=0;
            }
        }
        return x;
    }
}
