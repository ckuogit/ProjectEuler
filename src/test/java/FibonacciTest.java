import euler.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    static Fibonacci fibonacci = new Fibonacci();
    
    @Test
    public void findNthFibonacciTest() {

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, ...
        Assert.assertEquals("Fibonacci calculation failed for 1", 1, fibonacci.calculateNthFibonacci(1).intValue());
        Assert.assertEquals("Fibonacci calculation failed for 2", 1, fibonacci.calculateNthFibonacci(2).intValue());
        Assert.assertEquals("Fibonacci calculation failed for 10", 55, fibonacci.calculateNthFibonacci(10).intValue());

        // test negative number
        Assert.assertNull(fibonacci.calculateNthFibonacci(-1));
    }

    @Test
    public void findNthEvenFibonacciTest() {

        // 0, 1, 1, (2), 3, 5, (8), 13, 21, (34), 55, 89, (144), 233, 377, (610), 987, 1597, (2584), 4181, 6765, 10946, ...
        Assert.assertEquals("Fibonacci failed to find 1st even Number ", 2, fibonacci.calculateNthEvenFibonacci(1).intValue());
        Assert.assertEquals("Fibonacci failed to find 2nd even Number ", 8, fibonacci.calculateNthEvenFibonacci(2).intValue());
        Assert.assertEquals("Fibonacci failed to find 3rd even Number ", 34, fibonacci.calculateNthEvenFibonacci(3).intValue());
        Assert.assertEquals("Fibonacci failed to find 4th even Number ", 144, fibonacci.calculateNthEvenFibonacci(4).intValue());

        // test negative number
        Assert.assertNull(fibonacci.calculateNthEvenFibonacci(-1));
    }
}
