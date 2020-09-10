import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratorBodyTest {
    @Test
    public void checkPrimeNumber7901(){
        GeneratorBody primeTest = new GeneratorBody();
        boolean result = primeTest.isPrime(7901);
        assertTrue(result);
    }
}
