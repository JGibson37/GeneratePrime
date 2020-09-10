import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratorBodyTest {

    @Test
    public void checkPrimeNumber7901(){
        GeneratorBody primeTest = new GeneratorBody();
        boolean result = primeTest.isPrime(7901);
        assertTrue(result);
    }
    @Test
    public void checkNotPrimeNumber7903(){
        GeneratorBody primeTest = new GeneratorBody();
        boolean result = primeTest.isPrime(7903);
        assertFalse(result);
    }
    @Test
    public void checkRangeForPrime(){
        GeneratorBody primeTest = new GeneratorBody();
        List<Integer> result;
        result = primeTest.generate(7900, 7920);
        assertTrue(result.contains(7901));
    }
}
