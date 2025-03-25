package com.devstromo.medium.p46;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Permutations")
    void testPermutations() {
        var expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1),
                List.of(3, 1, 2), List.of(3, 2, 1));
        assertEquals(expected, solution.permute(new int[]{1, 2, 3}));
        expected = List.of(List.of(0, 1), List.of(1, 0));
        assertEquals(expected, solution.permute(new int[]{0, 1}));
    }

    @Test
    @DisplayName("Test Permutations Best")
    void testPermutationsBest() {
        var expected = List.of(List.of(1, 2, 3), List.of(1, 3, 2), List.of(2, 1, 3), List.of(2, 3, 1),
                List.of(3, 1, 2), List.of(3, 2, 1));
        var actual = solution.permuteBest(new int[]{1, 2, 3});

        var listComparator = Comparator.comparing(Object::toString);
        expected = new ArrayList<>(expected);
        actual = new ArrayList<>(actual);
        expected.sort(listComparator);
        actual.sort(listComparator);

        assertEquals(expected, actual);
    }
}