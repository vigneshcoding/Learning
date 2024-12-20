public class S3 {
    public static void main(String[] args) {
        String s="I Love Biryani";
        String ans="";

        String sp[]=s.split(s);
        System.out.println(s);

        for(int i=0;i<sp.length;i++){
            if (sp[i].equals("Love")) {
                ans+="Hate"+" ";
            }else{
                ans+=sp[i]+" ";
            }
        }
        System.out.println(ans);
    }
}
