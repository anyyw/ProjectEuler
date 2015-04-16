/**
 * Created by Andy on 4/9/2015.
 */
import java.util.ArrayList;
import java.util.Collections;

public class LargestPrimeFactor {

    private Long number;
    //private ArrayList<Long> factors;

    public LargestPrimeFactor(Long n) {
        this.number = n;
        //factors = new ArrayList<Long>();
    }

    public long calculate() {
        long largestfactor = number;
        for(long i = 2; i < largestfactor; i++) {
            if(i == largestfactor) {break;}
            if(largestfactor % i == 0) {
                //factors.add(i);
                //factors.add(number/i);
                largestfactor = largestfactor / i;
            }
        }
        //Collections.sort(factors);
        return largestfactor;
    }
}
