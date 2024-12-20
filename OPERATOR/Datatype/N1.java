class N1
{
    public static void main(String[] args) 
    {
        int a=250; 
        //int<---byte data loss will happened!
        byte res=(byte)a; // converting stmt
        System.out.println(a);
        System.out.println(res);
    }
}