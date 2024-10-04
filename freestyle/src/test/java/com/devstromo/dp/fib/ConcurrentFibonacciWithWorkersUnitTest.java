package com.devstromo.dp.fib;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcurrentFibonacciWithWorkersUnitTest {
    private ConcurrentFibonacciWithWorkers fibCalculator;

    @BeforeEach
    void setUp() {
        fibCalculator = new ConcurrentFibonacciWithWorkers();
    }

    @Test
    void testFibonacciBaseCases() {
        assertEquals(0, fibCalculator.fib(0));
        assertEquals(1, fibCalculator.fib(1));
    }

    @Test
    void testFibonacciSmallNumbers() {
        assertEquals(1, fibCalculator.fib(2));
        assertEquals(2, fibCalculator.fib(3));
        assertEquals(3, fibCalculator.fib(4));
        assertEquals(5, fibCalculator.fib(5));
        assertEquals(8, fibCalculator.fib(6));
    }

    @Test
    void testFibonacciLargerNumbers() {
        assertEquals(55, fibCalculator.fib(10));
        assertEquals(233, fibCalculator.fib(13));
        assertEquals(832040, fibCalculator.fib(30));
    }

    @Test
    void testConcurrentAccess() {
        Thread t1 = new Thread(() -> assertEquals(55, fibCalculator.fib(10)));
        Thread t2 = new Thread(() -> assertEquals(144, fibCalculator.fib(12)));
        Thread t3 = new Thread(() -> assertEquals(377, fibCalculator.fib(14)));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testMemoization() {
        long startTime = System.currentTimeMillis();
        fibCalculator.fib(30);
        long firstCallDuration = System.currentTimeMillis() - startTime;

        startTime = System.currentTimeMillis();
        fibCalculator.fib(30);
        long secondCallDuration = System.currentTimeMillis() - startTime;

        assertTrue(secondCallDuration < firstCallDuration, "Second call should be faster due to memoization");
    }
}