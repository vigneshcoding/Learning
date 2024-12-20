public class Palindrome {
    public static boolean isPalindrome(int num) {
        int rev=0;
        int temp=num;
        while (num>0) {
            rev=rev*10+num%10;
            num/=10;
        }
        return rev==temp;
    }
}
