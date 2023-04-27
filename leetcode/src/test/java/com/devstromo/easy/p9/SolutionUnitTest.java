package com.devstromo.easy.p9;

import static com.devstromo.easy.p9.Solution.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    public void testPositiveCases() {
        assertTrue(isPalindrome(121));
        assertTrue(isPalindrome(1221));
        assertTrue(isPalindrome(0));
        assertTrue(isPalindrome(123454321));
        assertTrue(isPalindrome(111111111));
    }

    @Test
    public void testNegativeCases() {
        assertFalse(isPalindrome(-121));
        assertFalse(isPalindrome(123456));
        assertFalse(isPalindrome(2147483647));
        assertFalse(isPalindrome(145));
        assertFalse(isPalindrome(1010));
    }
}