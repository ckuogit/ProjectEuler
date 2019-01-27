package euler;

import java.math.BigInteger;

/**
 * Problem 2 - Even Fibonacci numbers
 *
 * Problem 25 - 1000-digit Fibonacci number
 */
public class Fibonacci {

    /**
     * Find Nth number in Fibonacci sequence
     * sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, ...
     * f(0) = 0
     * f(1) = 1
     * f(2) = 1
     * f(3) = 2
     * ...
     * f(n) = f(n-1) + f(n-2)
     *
     * @param n     calculate nth number in fibonacci sequence
     * @return      the nth number in fibonacci
     *              null -- if n < 0
     */
    public BigInteger calculateNthFibonacci(int n) {

        if (n < 0)
            return null;

        if (n <= 1)
            return BigInteger.valueOf(n);

        BigInteger fib = BigInteger.valueOf(1);
        BigInteger previousFib = BigInteger.valueOf(1);

        for (int i = 2; i < n; ++i) {
            BigInteger temp = fib;
            fib = fib.add(previousFib);
            previousFib = temp;
        }

        return fib;
    }

    /**
     * Find the Nth even number in Fibonacci sequence
     * sequence: 0, 1, 1, (2), 3, 5, (8), 13, 21, (34), 55, 89, (144), 233, 377, (610), 987, 1597, (2584), 4181, 6765, (10946), ...
     * for example: 1st even number is 2, 2nd is 8, third is 34
     *
     * @param n     calculate nth number in fibonacci sequence
     * @return      the nth even number in Fibonacci sequence
     *              null -- if n < 1
     */
    public BigInteger calculateNthEvenFibonacci(int n) {

        if (n < 1)
            return null;

        // first even number
        if (n == 1)
            return BigInteger.valueOf(2);

        // current even number in the sequence
        BigInteger fib = BigInteger.valueOf(2);

        // previous fib number
        BigInteger previousFib = BigInteger.valueOf(1);

        // from the pattern above, f(3) = 2, f(6) = 8, f(9) = 34
        // nth even number is f(3*n)
        for (int i = 3; i < 3 * n; ++i) {
            BigInteger temp = fib;
            fib = fib.add(previousFib);
            previousFib = temp;
        }

        return fib;
    }


    /**
     * Problem 2
     * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
     *
     * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
     *
     * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
     *
     * @return
     */
    public BigInteger problem2() {

        long start = System.currentTimeMillis();

        BigInteger fib = BigInteger.valueOf(0);
        BigInteger fibSum = BigInteger.valueOf(0);

        int n = 0;
        while (fib.intValue() < 4000000) {
            fibSum = fibSum.add(fib);
            fib = calculateNthEvenFibonacci(++n);
        }

        long end = System.currentTimeMillis();

        System.out.println("Problem 2");
        System.out.println("\tFibonacci even number sum: " + fibSum);
        System.out.println("\tExecution time in milli-second: " + (end - start));

        return fibSum;
    }

    /**
     * Problem 25 - 1000-digit Fibonacci number
     * The Fibonacci sequence is defined by the recurrence relation:
     *
     * Fn = Fn−1 + Fn−2, where F1 = 1 and F2 = 1.
     * Hence the first 12 terms will be:
     *
     * F1 = 1
     * F2 = 1
     * F3 = 2
     * F4 = 3
     * F5 = 5
     * F6 = 8
     * F7 = 13
     * F8 = 21
     * F9 = 34
     * F10 = 55
     * F11 = 89
     * F12 = 144
     * The 12th term, F12, is the first term to contain three digits.
     *
     * What is the index of the first term in the Fibonacci sequence to contain 1000 digit
     * @return
     */
    public int problem25() {

        long start = System.currentTimeMillis();

        BigInteger previousFib = BigInteger.valueOf(1);
        BigInteger fib = BigInteger.valueOf(1);

        int index = 2;
        String fibStr = fib.toString();
        while (fibStr.length() < 1000) {
            ++index;
            BigInteger temp = fib;
            fib = fib.add(previousFib);
            previousFib = temp;
            fibStr = fib.toString();
        }

        long end = System.currentTimeMillis();

        System.out.println("Problem 25");
        System.out.println("\tFibonacci number: " + fib);
        System.out.println("\t# of digits: " + fibStr.length());
        System.out.println("\tFibonacci index: " + index);
        System.out.println("\tExecution time in milli-second: " + (end - start));

        return fibStr.length();
    }
}
