/*Print Below pattern
A B 3 4 5 
C D 3 4 5
E F 3 4 5
G H 3 4 5
I J 3 4 5
 */
public class P4 {
    public static void main(String[] args)throws Exception {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n/2){
                System.out.print(ch++ +" ");
                }else{
                 System.out.print(j+1+" ");
                }
            }
            Thread.sleep(50);
            System.out.println();
        }
    }
}

