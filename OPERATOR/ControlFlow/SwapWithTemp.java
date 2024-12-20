class SwapWithTemp{
    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println("Before swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("*********************");

        //logic
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}