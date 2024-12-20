/*Print the Below Pattern
A B C D E 
A B C D   
A B C     
A B       
A 
 */
public class P10 {
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

