public class B {
    public static void main(String[] args)throws Exception {
        int n=7;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i==0||j==0||i==n-1||i==n/2&&j<=(n-1)/2||j+i==n-1&&i<(n-1)/2||j-1==n||i==j&&i>(n-1)/2) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            System.out.println();
        }
    }
}
