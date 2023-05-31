package com.devstromo.kyu4.FactorialTail;

import static com.devstromo.kyu4.FactorialTail.FactorialTail.zeroes;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactorialTailUnitTest {

    @Test
    void basicTests() {
//        assertEquals(2, zeroes(10, 10));
        assertEquals(3, zeroes(16, 16));
    }

}