class INC
{
    public static void main(String[] args) {
        int a =10,b=20,c=30;
        System.out.println(a+":"+b+":"+c+":");
        int d=(a++ + c++) + ++b;
        int e=(c++ + a++) + c++;
        System.out.println(a++ + ++b);
        System.out.println(c++ + ++d);
        System.out.println(e);
        System.out.println(a+":"+b+":"+c+":"+d+":"+e);
    }
}