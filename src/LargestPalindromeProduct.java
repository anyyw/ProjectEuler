/**
 * Created by Andy on 4/14/2015.
 */
import java.lang.StringBuilder;

public class LargestPalindromeProduct {

    public LargestPalindromeProduct() {

    }

    public int calculate() {
        for (int b = 999; b > 1; b--){
            for (int a = 999; a > 900; a--) {
                int resultInt = a * b;
                String resultString = Integer.toString(resultInt);
                if (resultString.length() % 2 == 1) {
                    int middle = Math.round(resultString.length() / 2);
                    resultString = resultString.substring(0, middle) + resultString.substring(middle + 1);
                    if (isPalindrome(resultString)) {
                        return resultInt;
                    }
                } else {
                    if (isPalindrome(resultString)) {
                        return resultInt;
                    }
                }
            }
        }

        return 0;
    }

    public boolean isPalindrome(String s) {
        String parta = s.substring(0, s.length()/2);
        String partb = s.substring(s.length()/2);
        String reversedb = new StringBuilder(partb).reverse().toString();
        if(parta.equals(reversedb)){
            return true;
        }
        else {
            return false;
        }
    }
}