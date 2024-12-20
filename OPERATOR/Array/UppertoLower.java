import java.util.Arrays;

public class UppertoLower {
    public static void main(String[] args) {
        char[]a={'A','b','c','D','Z','$','e','#'}; 
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(solve(a)));
    
    }
    public static char[] solve(char[]a){
        for(int i=0;i<a.length;i++){
            if (a[i]>='A'&&a[i]<='Z') {
                a[i]+=32;
            }else if (a[i]>='a'&&a[i]<='z') {
                a[i]-=32;
            }
        }
        return a;
    }
}
