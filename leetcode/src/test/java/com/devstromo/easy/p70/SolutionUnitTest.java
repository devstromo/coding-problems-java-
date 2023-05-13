package com.devstromo.easy.p70;

import static com.devstromo.easy.p70.Solution.climbStairs;
import static com.devstromo.easy.p70.Solution.climbStairsOldJava;
import static com.devstromo.easy.p70.Solution.climbStairsRecursive;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testClimbStairs() {
        assertEquals(2, climbStairs(2));
    }

    @Test
    void testClimbStairs2() {
        assertEquals(3, climbStairs(3));
    }

    @Test
    void testClimbStairs3() {
        assertEquals(5, climbStairs(4));
    }

    @Test
    void testClimbStairs4() {
        assertEquals(2, climbStairsOldJava(2));
    }

    @Test
    void testClimbStairs5() {
        assertEquals(3, climbStairsOldJava(3));
    }

    @Test
    void testClimbStairs6() {
        assertEquals(5, climbStairsOldJava(4));
    }

    @Test
    void testClimbStairs7() {
        assertEquals(2, climbStairsRecursive(2));
    }

    @Test
    void testClimbStairs8() {
        assertEquals(3, climbStairsRecursive(3));
    }

    @Test
    void testClimbStairs9() {
        assertEquals(5, climbStairsRecursive(4));
    }

}