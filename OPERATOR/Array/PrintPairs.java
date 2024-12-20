import java.util.Arrays;

public class PrintPairs {
    public static void main(String[] args) {
        int[]a={2,6,8,10};
        System.out.println(Arrays.toString(a));
        pairs(a);
    }

    public static void pairs(int[]a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print(a[i]+" - "+a[j]+"   ");
            }
            System.out.println();
        }
    }
}
