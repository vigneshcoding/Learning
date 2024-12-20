import java.util.Arrays;

public class ShiftOne {
    public static void main(String[] args) {
        int[]a={0,1,1,0,0,0,1,0,1};
        System.out.println(Arrays.toString(a));
        int left=0;
        int right=a.length-1;
        while (left<=right) {
            if (a[left]==1 && a[right]==0) {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if (a[left]==0) 
                left++;
    
            if (a[right]==1) 
                right--;
            
        }
        System.out.println(Arrays.toString(a));
    }
}

/*Output:
[0, 1, 1, 0, 0, 0, 1, 0, 1]
[0, 0, 0, 0, 0, 1, 1, 1, 1]
 */