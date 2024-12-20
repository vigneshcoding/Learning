public class S2 {
    public static void main(String[] args) {
        String s="aaabbaac";
        solve(s);
    }

    public static void solve(String s){
        char[]a=s.toCharArray();
        int count=1;
        String ans="";

        for(int i=0;i<a.length-1;i++){
            if (a[i]==a[i+1]) {
                count++;
            }
            else{
                ans+=a[i]+":"+count+"\n";
                count=1;
            }
        }
        ans+=a[a.length-1]+":"+count;
        System.out.println(s);
        System.out.println(ans);
    }
}
