/*Print the Below Pattern
A 2 3 4 5 
1 B 3 4 5
1 2 C 4 5
1 2 3 D 5
1 2 3 4 E
 */
public class P6 {
    public static void main(String[] args)throws Exception {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(ch++ +" ");
                }
               else{
                    System.out.print(j+1+" ");
               }   
            }
        
            Thread.sleep(50);
            System.out.println();
        }
    }
}


