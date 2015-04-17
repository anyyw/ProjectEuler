/**
 * Created by Andy on 4/16/2015.
 * O(n^2) yo
 */
public class SmallestMultiple {

    private int upto;

    public SmallestMultiple(int upto) {
        this.upto = upto;
    }

    public int calculate() {
        int largest = upto;
        for(int i = upto - 1; i > 2; i--) {
            if(largest % i != 0) {
                largest = largest * i;
            }
        }

        int smallest = largest;
        System.out.println(largest);

        for(int j = 2; j < upto; j++) {
            if(smallest % j == 0) {
                smallest/=j;
            }
        }

        return smallest;
    }
}
