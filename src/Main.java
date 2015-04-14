/**
 * Created by Andy on 4/9/2015.
 */
public class Main {
    public static void main(String [] args) {
        LargestPalindromeProduct l = new LargestPalindromeProduct();
        LargestPrimeFactor lpf = new LargestPrimeFactor(600851475143L);
        System.out.println(l.isPalindrome("9009"));
        System.out.println(l.calculate());
        System.out.println(lpf.calculate());

    }
}
