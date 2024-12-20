/*Print the Below Pattern
A B C D E F G 
H           I
J           K
L           M
N           O
P           Q
R S T U V W X
 */
public class P5 {
    public static void main(String[] args)throws Exception {
        int n=7;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||j==n-1||i==n-1){
                System.out.print(ch++ +" ");
                }else{
                 System.out.print("  ");
                }
            }
            Thread.sleep(50);
            System.out.println();
        }
    }
}

