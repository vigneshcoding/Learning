public class S1 {
    public static void main(String[] args) {
        String a="10";
        String b="20";

        int res1=Integer.parseInt(a);
        int res2=Integer.parseInt(b);

        System.out.println(res1);
        System.out.println(res2);
    }
}

/*
 Note :
    String s="Ten";
    int res=Integer.perseInt(s);
        -CTS But RTE ie.. NumberFormalException
 */