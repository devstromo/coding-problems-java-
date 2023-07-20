package com.devstromo.easy.p2418;

import static com.devstromo.easy.p2418.Solution.sortPeople;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSortPeople() {
        assertArrayEquals(new String[] { "Mary", "Emma", "John" }, sortPeople(new String[] { "Mary", "John", "Emma" }, new int[] { 180, 165, 170 }));
    }

    @Test
    void testSortPeople2() {
        assertArrayEquals(new String[] { "Alice", "Bob", "Bob" }, sortPeople(new String[] { "Bob", "Alice", "Bob" }, new int[] { 155, 185, 150 }));
    }

}