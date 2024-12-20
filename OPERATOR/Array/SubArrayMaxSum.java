public class SubArrayMaxSum {
    public static void main(String[] args) {
        int[]a={1,-2,6,-1,3};
        solve(a);
    }

    public static void solve(int[]a){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int sum = 0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                }

                if (sum>max)
                    max=sum;
            }
        }
        System.out.println("Max Sum is : "+max);
    }
}
