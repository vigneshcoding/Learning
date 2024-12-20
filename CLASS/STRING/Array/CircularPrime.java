import java.util.*;
public class CircularPrime {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        String s=sc.next();
        char[]a=s.toCharArray();
        int length=a.length;

        if (isCircularPrime(length,a)) {
            System.out.println(s+" is Circular Prime");
        }
        else{
            System.out.println(s+" is Not Circular Prime");
        }
    }

    public static boolean isCircularPrime(int n,char[]a){
        for(int k=1;k<=n;k++){
            char First=a[0];
            for(int i=0;i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=First;

            String s=new String(a);
            int num=Integer.parseInt(s);

            if (!isPrime(num)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int num){
        if(num==0||num==1){
            return false;
        }

        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
