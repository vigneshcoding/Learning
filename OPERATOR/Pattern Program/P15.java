/*Print Below pattern
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 
5 4 3 2 1 
1 2 3 4 5 
 */
public class P15 {
    public static void main(String[] args)throws Exception {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0,k=5;j<n;j++,k--){
                if (i%2==0) {
                    System.out.print(j+1+" ");
                    
                }else{ 
                    System.out.print(k+" ");
                }
                Thread.sleep(50);
            }
            System.out.println();
        }
    }
}
