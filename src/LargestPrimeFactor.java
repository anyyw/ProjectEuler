/**
 * Created by Andy on 4/9/2015.
 */
public class LargestPrimeFactor {

    int number;

    public LargestPrimeFactor(int n) {
        this.number = n;
    }

    public int calculate() {
        int divided = 2;

        while(number % divided != 0) {
            divided++;
        }
        int calculatedNumber = number / divided;
        return calculatedNumber;
    }
}
