import java.util.ArrayList;
import java.util.List;

public class GeneratorBody implements PrimeNumberGenerator {

    List<Integer> primes = new ArrayList<>();

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        ifInverseRangeGiven(startingValue, endingValue);
        ifPositiveRangeGiven(startingValue, endingValue);
        return primes;
    }

    @Override
    public boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void ifInverseRangeGiven(int startingValue, int endingValue) {
        if (startingValue > endingValue) {
            for (int x = startingValue; x >= endingValue; x--) {
                boolean result = isPrime(x);
                if (result == true) {
                    savePrime(x);
                }
            }
        }
    }

    public void ifPositiveRangeGiven(int startingValue, int endingValue) {
        for (int x = startingValue; x <= endingValue; x++) {
            boolean result = isPrime(x);
            if (result == true) {
                savePrime(x);
            }
        }
    }

    private void savePrime(int x) {
        primes.add(x);
    }

    public List<Integer> getPrimes() {
        return primes;
    }
}
