package com.devstromo.easy.p2367;

import static com.devstromo.easy.p2367.Solution.arithmeticTriplets;
import static com.devstromo.easy.p2367.Solution.arithmeticTripletsBest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testArithmeticTriplets() {
        assertEquals(2, arithmeticTriplets(new int[] { 4, 5, 6, 7, 8, 9 }, 2));
    }

    @Test
    void testArithmeticTriplets2() {
        assertEquals(2, arithmeticTriplets(new int[] { 0, 1, 4, 6, 7, 10 }, 3));
    }

    @Test
    void testArithmeticTripletsBest() {
        assertEquals(2, arithmeticTripletsBest(new int[] { 4, 5, 6, 7, 8, 9 }, 2));
    }

    @Test
    void testArithmeticTripletsBest2() {
        assertEquals(2, arithmeticTripletsBest(new int[] { 0, 1, 4, 6, 7, 10 }, 3));
    }
}