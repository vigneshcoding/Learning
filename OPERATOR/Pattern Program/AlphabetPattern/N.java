public class N {
    public static void main(String[] args)throws Exception {
        int n=11;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (j==0||i==j||j==n-1) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            System.out.println();
        }
    }
}