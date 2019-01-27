package euler;

import java.math.BigInteger;
import java.util.*;

/**
 * Problem 20 - Factorial digit sums
 *
 * Problem 34 - Digit factorials
 */
public class Factorial {

    /**
     *
     * @param n             a number equals to or greater than 0
     * @return              factorial number n!
     *                      null -- if n < 0
     */
    public BigInteger calculateNFactorial(int n) {

        if (n < 0) {
            return null;
        }

        if (n <= 1)
            return BigInteger.valueOf(1);

        BigInteger factorialNumber = BigInteger.valueOf(1);
        for (int i = 2; i <= n; ++i) {
            factorialNumber = factorialNumber.multiply(BigInteger.valueOf(i));
        }

        return factorialNumber;
    }

    /**
     * Problem 20
     * n! means n × (n − 1) × ... × 3 × 2 × 1
     *
     * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
     * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
     *
     * Find the sum of the digits in the number 100!
     *
     * @return
     */
    public int problem20() {

        long start = System.currentTimeMillis();

        BigInteger factorial = calculateNFactorial(100);
        if (null == factorial) {
            // this will not happen, put it here to display checking value before proceeding
            System.out.println("calculateNFactorial(100) returns null");
            return  -1;
        }

        String factorialStr = String.valueOf(factorial);
        char[] digits = factorialStr.toCharArray();

        int result = 0;
        for (int i = 0; i < digits.length; ++i) {
            result += Character.getNumericValue(digits[i]);
        }

        long end = System.currentTimeMillis();

        System.out.println("Problem 20");
        System.out.println("\t100!: " + factorialStr);
        System.out.println("\tsum of all digits: " + result);
        System.out.println("\tExecution time in milli-second: " + (end - start));

        return result;
    }

    /**
     * Problem 34
     * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
     *
     * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
     *
     * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
     *
     * @return
     */
    public int problem34() {

        long start = System.currentTimeMillis();

        // create a map of  (0, 0!) - (9, 9!)
        Map<Integer, BigInteger> facMap = new Hashtable<>();
        for (int i = 0; i < 10; ++i) {
            facMap.put(i, calculateNFactorial(i));
        }

        // keep the number and sum of it's digit to verify if the number found is correct, it should at least contains 145
        Map<Integer, List<Integer>> numbDigitSumMap = new HashMap<>();
        int result = 0;

        // found upper bound 1499999 from https://www.xarg.org/puzzle/project-euler/problem-34/
        for (int number = 10; number < 1499999; ++number) {
            List<Integer> facList = new ArrayList<>();

            int sum = 0;
            int index = 0;
            int facNumber = number;
            while (facNumber > 0) {
                int d = facNumber % 10;
                sum += facMap.get(d).intValue();
                facNumber /= 10;

                facList.add(index++, facMap.get(d).intValue());
            }

            if (number == sum) {
                result += number;

                numbDigitSumMap.put(number, facList);
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("Problem 34");
        for(Map.Entry<Integer, List<Integer>> entry : numbDigitSumMap.entrySet()) {
            System.out.print("\t" + entry.getKey() + " = ");
            for(Integer fac : entry.getValue()) {
                System.out.print(fac + " + ");
            }
            System.out.println();
        }

        System.out.println("\tResult: " + result);
        System.out.println("\tExecution time in milli-second: " + (end - start));

        return result;
    }
}
