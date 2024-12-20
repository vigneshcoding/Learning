public class SwapWithoutTemp {
        public static void main(String[] args) {
            int a=5;
            int b=10;
            System.out.println("Before swap");
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("*********************");
    
            //logic
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("a:"+a);
            System.out.println("b:"+b);
        }
    }
