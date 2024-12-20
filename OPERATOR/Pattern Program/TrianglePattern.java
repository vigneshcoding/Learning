public class TrianglePattern {
    public static void main(String[] args)throws Exception {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i+j<=n-1) {
                    System.out.print(ch++ +" ");
                    
                }else{ 
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            ch='A';
            System.out.println();
        }
    }
}

/*
 i>=j right angle Triangle
 i<=j rev right angle Triangle
 i+j>=n-1 opp right angle triangle
 i+j<=n-1 inverser
 */
