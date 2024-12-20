public class SprialPrintArray {
    public static void main(String[] args) {
        int[][]a={
            {10,20,38,43,30},
            {50,67,70,81,10},
            {90,18,23,30,50},
            {40,50,64,76,30},
            {10,80,30,44,33}
        };

        int n=5;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;

        while (left<=right && top<=bottom) {
            //Left to Right
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            System.out.println();
            //Top to Bottom
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            System.out.println();
            //Right to Top
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            System.out.println();
            //Bottom to Top
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
            System.out.println();
        }
    }
}
