import java.util.Arrays;

public class ZigzagMerge {
    public static void main(String[] args) {
        int[]a={10,20,30,40};
        int[]b={50,60,70,80};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int[]res=zigZag(a, b);
        System.out.println(Arrays.toString(res));
    }
    public static int[] zigZag(int[]x,int[]y){
        int[]z=new int[x.length + y.length];

        for(int i=0,m=0,n=y.length-1;i<z.length;i++){
            if (i%2==0){
                z[i]=x[m++];
            }else{
                z[i]=y[n--];
            }
        }
        return z;
    }
}
