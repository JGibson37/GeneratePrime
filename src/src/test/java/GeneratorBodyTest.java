import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratorBodyTest {
    @Before
    public void arrayTestStartUp(){
        GeneratorBody primeTest = new GeneratorBody();
        List<Integer> result;
    }
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
    @Test
    public void checkRangeForNonPrime(){
        GeneratorBody primeTest = new GeneratorBody();
        List<Integer> result;
        result = primeTest.generate(7900, 7920);
        assertFalse(result.contains(7910));
    }
    @Test
    public void findPrimesInverseRange(){
        GeneratorBody primeTest = new GeneratorBody();
        List<Integer> result;
        result = primeTest.generate(7920, 7900);
        assertTrue(result.contains(7901));
    }
    @Test
    public void shouldReturnPrimeList(){
        GeneratorBody primeTest = new GeneratorBody();
        List<Integer> stored;
        stored = primeTest.generate(7900, 7920);
        List<Integer> result;
        result = primeTest.getPrimes();
        assertSame(stored, result);
    }
}
