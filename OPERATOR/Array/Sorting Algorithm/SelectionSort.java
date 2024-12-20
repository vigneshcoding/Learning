import java.util.Arrays;  
public class SelectionSort {
    public static void main(String[] args) {
        int[]a={2,1,0,5,-3,6};

        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            int si=i;

            for(int j=i+1;j<a.length-1;j++){
                if (a[j]<a[si]) {
                    si=j;
                }
                int temp=a[i];
                a[i]=a[si];
                a[si]=temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
