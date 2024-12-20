public class StringToChar {
    public static void main(String[] args) {
        String s="Java";
        char[]a=new char[s.length()];

        for(int i=0;i<a.length;i++){ 
            a[i]=s.charAt(i);
        }
        System.out.println(s);
        System.out.println(a);
    }
}
