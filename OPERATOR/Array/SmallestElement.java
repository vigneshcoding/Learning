import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[]a={6,16,3,4,24};
        System.out.println(Arrays.toString(a));
        int res=findtSmallest(a);
        System.out.println("Smallest Element is : "+res);
    }

    public static int findtSmallest(int[]k){
        int Smallest=k[0];
        for(int i=0;i<k.length;i++){
            if (k[i]<Smallest) {
                Smallest=k[i];
            }
        }
        return Smallest;
    }
}
