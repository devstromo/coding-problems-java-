package com.devstromo.easy.p1773;

import static com.devstromo.easy.p1773.Solution.countMatches;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testCountMatches() {
        var items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone"));
        assertEquals(1, countMatches(items, "color", "silver"));
    }

    @Test
    void testCountMatches2() {
        var items = List.of(List.of("phone", "blue", "pixel"), List.of("computer", "silver", "lenovo"), List.of("phone", "gold", "iphone"));
        assertEquals(2, countMatches(items, "type", "phone"));
    }
}