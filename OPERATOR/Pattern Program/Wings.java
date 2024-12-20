public class Wings {
    public static void main(String[] args)throws Exception {
        int n=7;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i>=j&&i+j<=n-1||i<=j&&i+j>=n-1) {
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
