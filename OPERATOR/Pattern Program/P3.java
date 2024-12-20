/* Print the Below Pattern
1 2 3 4 5 
A B C D E 
1 2 3 4 5 
A B C D E 
1 2 3 4 5 
*/
public class P3 {
    public static void main(String[] args)throws Exception {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i%2==0){
                System.out.print(j+1+" ");
                }else{
                 System.out.print(ch++ +" ");
                }
            }
            ch='A';
            Thread.sleep(50);
            System.out.println();
        }
    }
}
