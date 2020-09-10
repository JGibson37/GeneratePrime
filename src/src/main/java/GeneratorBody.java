import java.util.List;

public class GeneratorBody implements PrimeNumberGenerator {

    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        return null;
    }

    @Override
    public boolean isPrime(int value) {
        for (int i=2; i < value/2; i++){
            if (value % i == 0){
                return false;
            }
        }
        return true;
    }
}
