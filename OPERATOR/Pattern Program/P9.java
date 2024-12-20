/*Print the Below Pattern
A 1 A 1 A 
B 2 B 2 B
C 3 C 3 C
D 4 D 4 D
E 5 E 5 E
 */
public class P9 {
    public static void main(String[] args)throws Exception {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j%2==0){
                System.out.print(ch+" ");
                }else{
                 System.out.print(i+1+" ");
                }
            }
            ch++; 
            Thread.sleep(50);
            System.out.println();
        }
    }
}

