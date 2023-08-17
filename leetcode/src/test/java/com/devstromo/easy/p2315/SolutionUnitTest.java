package com.devstromo.easy.p2315;

import static com.devstromo.easy.p2315.Solution.countAsterisks;
import static com.devstromo.easy.p2315.Solution.countAsterisksNonSplit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {
    @Test
    void testCountAsterisks() {
        assertEquals(2, countAsterisks("l|*e*et|c**o|*de|"));
    }

    @Test
    void testCountAsterisks2() {
        assertEquals(0, countAsterisks("iamprogrammer"));
    }

    @Test
    void testCountAsterisks3() {
        assertEquals(5, countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    @Test
    void testCountAsterisksNonSplit() {
        assertEquals(2, countAsterisksNonSplit("l|*e*et|c**o|*de|"));
    }

    @Test
    void testCountAsterisksNonSplit2() {
        assertEquals(0, countAsterisksNonSplit("iamprogrammer"));
    }

    @Test
    void testCountAsterisksNonSplit3() {
        assertEquals(5, countAsterisksNonSplit("yo|uar|e**|b|e***au|tifu|l"));
    }
}