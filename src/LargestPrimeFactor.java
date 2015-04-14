/**
 * Created by Andy on 4/9/2015.
 */
import java.util.ArrayList;
import java.util.Collections;

public class LargestPrimeFactor {

    private Long number;
    private ArrayList<Long> factors;

    public LargestPrimeFactor(Long n) {
        this.number = n;
        factors = new ArrayList<Long>();
    }

    public double calculate() {
        for(long i = 2; i < number/2; i++) {
            if(number % i == 0) {
                factors.add(i);
                factors.add(number/i);
            }
        }
        Collections.sort(factors);
        return factors.get(factors.size());
    }
}
