public class Balanced {
    public static void main(String[] args) {
        String s="([{}])";
        System.out.println(s);
        String res=isStringBalanced(s);
        System.out.println(res);
    }

    public static String isStringBalanced(String s){
        String Open="",Close="";
        char[]a=s.toCharArray();

        for(int i=0;i<a.length;i++){
            if(a[i]=='('||a[i]=='{'||a[i]=='['){
                Open+=a[i];
            }else if (a[i]==')'||a[i]=='}'||a[i]==']') {
                Close+=a[i];
            }

        }

        if (Open.length()!=Close.length()) {
            char[]ch1=Open.toCharArray();
            char[]ch2=Close.toCharArray();

            if(ch1.length!=ch2.length){
                return "Not Balanced";

                for(int i=0,j=ch2.length-1;i<ch2.length;i++,j--){
                    if (!ch1[i]=='[' && ch2[j]==']'
                    ||ch1[i]=='{'&&ch2[j]=='}'
                    ||ch1[i]=='('&&ch2[j]==')') {
                        return "Not Balanced";
                    }
                }
            }

        }
    }
}
