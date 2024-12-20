public class P11 {
    public static void main(String[] args)throws Exception {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i>=j) {
                    System.out.print(j+1+" ");
                    
                }else{ 
                    System.out.print("  ");
                }
                Thread.sleep(50);
            }
            System.out.println();
        }
    }
}
