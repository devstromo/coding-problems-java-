package com.devstromo.easy.p509;

import static com.devstromo.easy.p509.Solution.fib;
import static com.devstromo.easy.p509.Solution.fibStatic;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testFibMemo() {
        assertEquals(1, fib(2));
        assertEquals(2, fib(3));
        assertEquals(3, fib(4));
        assertEquals(34, fib(9));
        assertEquals( 317811, fib(28));
        assertEquals( 514229, fib(29));
        assertEquals( 832040, fib(30));
    }

    @Test
    void testFibStatic() {
        assertEquals(1, fibStatic(2));
        assertEquals(2, fibStatic(3));
        assertEquals(3, fibStatic(4));
        assertEquals(34, fibStatic(9));
        assertEquals( 317811, fibStatic(28));
        assertEquals( 514229, fibStatic(29));
        assertEquals( 832040, fibStatic(30));
    }
}