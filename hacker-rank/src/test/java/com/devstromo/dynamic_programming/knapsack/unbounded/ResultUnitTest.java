package com.devstromo.dynamic_programming.knapsack.unbounded;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ResultUnitTest {

    @Test
    void testUnboundedKnapsack() {
        assertEquals(12, Result.unboundedKnapsack(12, List.of(1, 6, 9)));
    }

    @Test
    void testUnboundedKnapsack1() {
        assertEquals(9, Result.unboundedKnapsack(9, List.of(3, 4, 4, 4, 8)));
    }

    @Test
    void testUnboundedKnapsack3() {
        assertEquals(13, Result.unboundedKnapsack(13, List.of(3, 7, 9, 11)));
    }

    @Test
    void testUnboundedKnapsack4() {
        assertEquals(10, Result.unboundedKnapsack(11, List.of(3, 7, 9)));
    }
}