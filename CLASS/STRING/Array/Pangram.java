public class Pangram {
    public static void main(String[] args) {
        String s="The quick brown fox jumps over the lazy dog";
        s=s.toUpperCase();
        char[]a=s.toCharArray();
        boolean []letters=new boolean[26];

        for(int i=0;i<a.length;i++){
            if(a[i]!=' ')
            letters[a[i]-97]=true;
        }

        String res="Pangram";
        for(int i=0;i<letters.length;i++){
            if (!letters[i]) {
                res="Not a Pangram";
                break;
            }
        }
        System.out.println(res);
    }
}
