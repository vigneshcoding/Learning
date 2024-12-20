public class PrefixSum {
    public static void main(String[] args) {
        int[]a={1,-2,6,-1,3};
        solve(a);
    }

    public static void solve(int[]a){
        int[]pre=new int[a.length];
        pre[0]=a[0];
        int max=Integer.MIN_VALUE;
        for (int i=1;i<pre.length;i++){
            pre[i]=pre[i-1]+a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int cs=(i==0)?pre[j]:pre[j]-pre[i-1];
                if (cs>max) {
                    max=cs;
                }
            }
        }
        System.out.println("Max Sum is : "+max);
    }
}
