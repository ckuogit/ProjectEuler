package euler;

import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {

        Fibonacci fibonacci = new Fibonacci();
        BigInteger sumOfEvenNumber = fibonacci.problem2();
        int sumOf1000Digits = fibonacci.problem25();

        Factorial factorial = new Factorial();
        int factorialDigitSum = factorial.problem20();
        int problem34Result = factorial.problem34();

        Problem19 problem19 = new Problem19();
        int sumOfSundays = problem19.FindFirstSundays();
    }
}
