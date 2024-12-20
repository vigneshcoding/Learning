public class Test {
    public static void main(String[] args) {
        int start=1;
        int end=100;
        while(start<=end)
        {
            if (start%3==0 && start%7==0) {
                System.out.println(start);
            }
            start++;
        }
    }
}
