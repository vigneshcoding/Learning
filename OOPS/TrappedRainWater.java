/**
 * TrappedRainWater
 */
/*public class TrappedRainWater {
    public static void main(String[] args) {
        int[]b={4,2,0,3,2,5};
        System.out.println("Total Water Trapped :"+trappedWater(b));
    }

    public static int trappedWater(int[]b){
        int []lm=new int[b.length];
        lm[0]=b[0];
        for (int i=1;i<b.length;i++){
            lm[i]=Math.max(b[i],lm[i-1]);
        }

        int[]rm=new int[b.length];
        rm[rm.length-1]=b[b.length-1];
        for(int i=b.length-2;i>=0;i--){
            rm[i]=Math.max(b[i], rm[i+1]);
        }
        int sum=0;
        for(int i=0;i<b.length;i++);
        {
            int w=Math.min(lm[i],rm[i]);
            sum+=(w-b[i]);
        }
        return sum;
    }
} */
/**
 * TrappedRainWater
 */
public class TrappedRainWater {
    public static void main(String[] args) {
        int[] b = {4, 2, 0, 3, 2, 5};
        System.out.println("Total Water Trapped: " + trappedWater(b));
    }

    public static int trappedWater(int[] b) {
        int[] lm = new int[b.length];
        lm[0] = b[0];
        for (int i = 1; i < b.length; i++) {
            lm[i] = Math.max(b[i], lm[i - 1]);
        }

        int[] rm = new int[b.length];
        rm[rm.length - 1] = b[b.length - 1];
        for (int i = b.length - 2; i >= 0; i--) {
            rm[i] = Math.max(b[i], rm[i + 1]);
        }

        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            int w = Math.min(lm[i], rm[i]);
            sum += (w - b[i]);
        }
        return sum;
    }
}
