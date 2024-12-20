/*
A B C D 1 
A B C 2 D
A B 3 C D
A 4 B C D
5 A B C D
 */
public class P8 {
    public static void main(String[] args)throws Exception {
        int n=5;
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0,m=5;j<n;j++,m--){
                if(i+j==n-1){
                    System.out.print(m+" ");  
                }
               else{
                    System.out.print(ch++ +" ");
               }
            }
            ch='A';
            Thread.sleep(50);
            System.out.println();
        }
    }
}


