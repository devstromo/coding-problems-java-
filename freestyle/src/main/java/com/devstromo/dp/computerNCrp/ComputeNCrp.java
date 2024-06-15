package com.devstromo.dp.computerNCrp;

public class ComputeNCrp {

    /**
     * Computes nCr % p using a simple recursive approach.
     *
     * @param n the total number of items
     * @param r the number of items to choose
     * @param p the prime number for modulo operation
     * @return the value of nCr % p
     *
     * <p> This method uses a recursive approach to compute the binomial coefficient modulo p. It directly applies
     * the recursive definition of binomial coefficients:
     * <ul>
     *     <li>nCr = (n-1)C(r-1) + (n-1)Cr</li>
     * </ul>
     * The result is taken modulo p to prevent overflow.
     *
     * <p><b>Time Complexity:</b> O(2^n)
     * <p><b>Space Complexity:</b> O(n)
     */
    public int solutionRecursive(int n, int r, int p) {
        if (r > n) {
            return 0;
        }
        if (r == 0 || r == n)
            return 1;
        return (solutionRecursive(n - 1, r - 1, p) % p + solutionRecursive(n - 1, r, p) % p) % p;
    }

    /**
     * Computes nCr % p using a dynamic programming approach with a 1D array.
     *
     * @param n the total number of items
     * @param r the number of items to choose
     * @param p the prime number for modulo operation
     * @return the value of nCr % p
     *
     * <p> This method uses a dynamic programming approach with a 1D array to compute the binomial coefficient modulo p.
     * It iteratively updates the array to reflect the number of ways to choose r items from n items.
     *
     * <p><b>Time Complexity:</b> O(n * r)
     * <p><b>Space Complexity:</b> O(r)
     */
    public int solution(int n, int r, int p) {
        if (r > n - r) {
            r = n - r;
        }
        var C = new int[r + 1];
        C[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = Math.min(i, r); j > 0; j--) {
                C[j] = (C[j] + C[j - 1]) % p;
            }
        }
        return C[r];
    }

    /**
     * Computes nCr % p using a dynamic programming approach with a 2D array.
     *
     * @param n the total number of items
     * @param r the number of items to choose
     * @param p the prime number for modulo operation
     * @return the value of nCr % p
     *
     * <p> This method uses a dynamic programming approach with a 2D array to compute the binomial coefficient modulo p.
     * It builds a table where dp[i][j] represents the number of ways to choose j items from i items, taking results modulo p.
     *
     * <p><b>Time Complexity:</b> O(n * r)
     * <p><b>Space Complexity:</b> O(n * r)
     */
    public int solution2DArray(int n, int r, int p) {
        var dp = new int[n + 1][r + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, r); j++) {
                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % p;
                }
            }
        }
        return dp[n][r];
    }

    /**
     * Computes nCr % p using Lucas' Theorem.
     *
     * @param n the total number of items
     * @param r the number of items to choose
     * @param p the prime number for modulo operation
     * @return the value of nCr % p
     */
    public int solutionUsingLucasTheorem(int n, int r, int p) {
        if (r == 0) {
            return 1;
        }

        // Compute n! % p
        int[] fact = new int[p];
        fact[0] = 1;
        for (int i = 1; i < p; i++) {
            fact[i] = fact[i - 1] * i % p;
        }

        // Compute nCr % p using Lucas' Theorem
        int result = 1;
        while (n > 0 && r > 0) {
            int ni = n % p;
            int ri = r % p;

            if (ri > ni) {
                return 0;
            }

            result = result * fact[ni] % p * modInverse(fact[ri], p) % p * modInverse(fact[ni - ri], p) % p;
            n /= p;
            r /= p;
        }

        return result;
    }

    /**
     * Computes nCr % p using Fermat's Little Theorem.
     *
     * @param n the total number of items
     * @param r the number of items to choose
     * @param p the prime number for modulo operation
     * @return the value of nCr % p
     *
     * <p> This method uses Fermat's Little Theorem to compute the binomial coefficient modulo p. Fermat's Little Theorem
     * states that if p is a prime number, then for any integer a such that p does not divide a, a^(p-1) ≡ 1 (mod p).
     * Using this theorem, the modular inverse of "a" under modulo p can be computed as a^(p-2) % p.
     *
     * <p> The method first computes the factorials up to n modulo p and stores them in an array. Then it computes the
     * binomial coefficient using the formula:
     * <ul>
     *     <li>nCr % p = (n! / (r! * (n-r)!)) % p</li>
     *     <li>      = (n! * modInverse(r!, p) * modInverse((n-r)!, p)) % p</li>
     * </ul>
     *
     * <p><b>Time Complexity:</b> O(n + log p)
     * <p><b>Space Complexity:</b> O(n)
     * @see #modInverse(int, int)
     */
    public int solutionUsingFermatLittleTheorem(int n, int r, int p) {
        if (n < r)
            return 0;
        if (r == 0)
            return 1;
        var fac = new int[n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;
        return (fac[n] * modInverse(fac[r], p) % p * modInverse(fac[n - r], p) % p) % p;
    }

    /**
     * Computes the modular inverse of a number a under modulo p using Fermat's Little Theorem.
     *
     * @param a the number to find the modular inverse of
     * @param p the prime number for modulo operation
     * @return the modular inverse of a under modulo p
     */
    private int modInverse(int a, int p) {
        return power(a, p - 2, p);
    }

    /**
     * Computes (base^exp) % mod using iterative method to perform modular exponentiation.
     *
     * @param base the base number
     * @param exp  the exponent
     * @param mod  the modulo
     * @return (base ^ exp) % mod
     */
    private int power(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            exp = exp >> 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
