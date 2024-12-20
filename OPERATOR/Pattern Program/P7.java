/*Print the Below Pattern
  4 3 2 1 
5   3 2 1
5 4   2 1
5 4 3   1
5 4 3 2
 */
public class P7 {
    public static void main(String[] args)throws Exception {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0,m=5;j<n;j++,m--){
                if(i==j){
                    System.out.print("  ");
                }
               else{
                    System.out.print(m+" ");
               }

                
            }
        
            Thread.sleep(50);
            System.out.println();
        }
    }
}



