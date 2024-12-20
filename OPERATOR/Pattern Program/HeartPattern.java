
public class HeartPattern {
    public static void main(String[] args)throws Exception {
        int n=7;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==0&&i<(n-1)/2&&i==1||i-j==n/2||j==n-1-(i-n/2)||j==n-1&&i<(n-1)/2||i+1==j&&j<(n-1)/2||i+j==n-2) 
                {
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