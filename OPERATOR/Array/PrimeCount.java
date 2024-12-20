import java.util.Arrays;

public class PrimeCount {
    public static void main(String[] args) {
        int[]a={4,5,7,1,11,3,8};
        int count=0;
        int sum=0;

        for(int i=0;i<a.length;i++){
            if (isPrime(a[i])) {
                count++;
                sum+=a[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Prime Count : "+count);
        System.out.println("Prime Sum : "+sum);
    }

    public static boolean isPrime(int number){
        if (number==1||number==0) {
            return false;
        }
        for(int i=2;i<number;i++){
            if (number%i==0) {
                return false;
            }
        }
        return true;
    }
}
