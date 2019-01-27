import euler.Factorial;
import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    static Factorial factorial = new Factorial();

    @Test
    public void calculateNFactorialTest() {

        // positive tests
        Assert.assertEquals("Factorial calculation failed for 7!", 5040, factorial.calculateNFactorial(7).intValue());
        Assert.assertEquals("Factorial calculation failed for 11!", 39916800, factorial.calculateNFactorial(11).intValue());

        // negative test
        Assert.assertNull("Factorial calculation for (-1)!", factorial.calculateNFactorial(-1));
    }
}
