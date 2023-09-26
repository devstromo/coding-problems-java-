package com.devstromo.kyu3.Fibonacci;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class Fibonacci {

    /**
     * Calculates the Fibonacci number at the specified index using the fast doubling method.
     * <p>
     * The fast doubling method allows the Fibonacci number at a given index to be calculated
     * in O(log n) time complexity. This implementation supports both positive and negative indices.
     * For negative indices, the Fibonacci sequence follows the symmetry: F(-n) = (-1)^(n + 1) * F(n).
     * </p>
     *
     * @param n - The index of the Fibonacci sequence. Can be positive, negative, or zero.
     * @return The Fibonacci number at the specified index.
     *
     * <p>
     * The function performs the following steps:
     * 1. <b>Initialization:</b>
     *    - Initialize variables a to 0 and b to 1, representing the base cases of the Fibonacci sequence.
     *    - Compute the absolute value of the input index n, converting it to a long data type.
     * </p>
     *
     * <p>
     * 2. <b>Main Loop:</b>
     *    - Iterate through each bit of the absolute value of n, starting from the highest bit to the lowest.
     *    - For each bit, perform calculations to update the values of a and b, thereby doubling the index.
     * </p>
     *
     * <p>
     * 3. <b>Fibonacci Calculation:</b>
     *    - Calculate new values of a and b as follows:
     *      a = a * (2b - a)
     *      b = a^2 + b^2
     * </p>
     *
     * <p>
     * 4. <b>Bit Checking and Update:</b>
     *    - If the current bit is 1, further update the values of a and b:
     *      a = b
     *      b = a + b (using the original value of a)
     * </p>
     *
     * <p>
     * 5. <b>Sign Adjustment for Negative Indices:</b>
     *    - If the input index n is negative and even, adjust the sign of the resulting Fibonacci number.
     * </p>
     *
     * <p>
     * 6. <b>Return Result:</b>
     *    - Return the calculated Fibonacci number.
     * </p>
     *
     * @implNote The function utilizes a helper function multiply(x, y) to perform the multiplication
     *           of BigInteger values. In this specific implementation, the helper function directly
     *           calls the multiply method of the BigInteger class, but it can be adapted for different
     *           multiplication algorithms or additional logic.
     */

    public static BigInteger fib(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        long bitValue = n.abs().longValue();

        for (long bit = Long.highestOneBit(bitValue); bit != 0; bit >>>= 1) {
            BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
            BigInteger e = multiply(a, a).add(multiply(b, b));
            a = d;
            b = e;
            if ((bitValue & bit) != 0) {
                BigInteger c = a.add(b);
                a = b;
                b = c;
            }
        }
        if (n.signum() < 0 && n.abs().mod(BigInteger.TWO).signum() == 0) {
            a = a.negate();
        }
        return a;
    }

    private static BigInteger multiply(BigInteger x, BigInteger y) {
        return x.multiply(y);
    }

}
