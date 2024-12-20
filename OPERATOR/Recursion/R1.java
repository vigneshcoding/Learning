
public class R1 {

    static int end=1;
    static int start=100;
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        if (start>=end) {
            System.out.println(start);
            start--;
            solve();
        }
    }
    
}