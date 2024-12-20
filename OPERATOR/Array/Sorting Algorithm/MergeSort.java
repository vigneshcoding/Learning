import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]a={8,3,2,1,4,16,6,12};
        System.out.println(Arrays.toString(a));
        divide(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void divide(int []a,int l,int h)
    {
        if (l==h)
            return;

        int m=(l+h)/2;
         divide(a, l, m);
         divide(a, m+1, h);
         merge(a, l, m, h);
    }

    public static void merge(int[]a, int l, int m, int h){
        int left=l;
        int right=m+1;
        int mid=m;
        int []k=new int[a.length];
        int x=0;

        while (left<=mid && right<=h) 
        {
            if (a[left]<a[right])
                k[x++]=a[left++];
            else
                k[x++]=a[right++];
        }
        while (left<=m) {
            k[x++]=a[left];
            left++;
        }
        while (right<=h) {
            k[x++]=a[right];
            right++;
        }
        for(int i=1,y=0;i<=h;i++,y++){
            a[i]=k[y];
        }
    }
}
