package com.devstromo.easy.p2520;

import static com.devstromo.easy.p2520.Solution.countDigits;
import static com.devstromo.easy.p2520.Solution.countDigitsOther;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCountDigits() {
        assertEquals(1, countDigits(7));
    }

    @Test
    void testCountDigits2() {
        assertEquals(2, countDigits(121));
    }

    @Test
    void testCountDigits3() {
        assertEquals(4, countDigits(1248));
    }

    @Test
    void testCountDigitsOther() {
        assertEquals(1, countDigitsOther(7));
    }

    @Test
    void testCountDigitsOther2() {
        assertEquals(2, countDigitsOther(121));
    }

    @Test
    void testCountDigitsOther3() {
        assertEquals(4, countDigitsOther(1248));
    }

}