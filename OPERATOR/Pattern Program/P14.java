/*Print Below pattern
A A A A $ 
A A A $ A 
A A $ A A 
A $ A A A 
$ A A A A 
 */
public class P14 {
    public static void main(String[] args)throws Exception {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if (i+j==n-1) {
                    System.out.print("$ ");
                    
                }else{ 
                    System.out.print("A ");
                }
                Thread.sleep(50);
            }
            System.out.println();
        }
    }
}
