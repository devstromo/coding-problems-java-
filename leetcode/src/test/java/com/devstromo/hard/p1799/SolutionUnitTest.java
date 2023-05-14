package com.devstromo.hard.p1799;

import static com.devstromo.hard.p1799.Solution.maxScoreBestRuntime;
import static com.devstromo.hard.p1799.Solution.maxScoreCompact;
import static com.devstromo.hard.p1799.Solution.maxScoreCompactSecond;
import static com.devstromo.hard.p1799.Solution.maxScoreRecursive;
import static com.devstromo.hard.p1799.Solution.maxScoresSolution;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMaxScore() {
        var nums = new int[] { 1, 2 };
        assertEquals(1, maxScoresSolution(nums));
    }

    @Test
    void testMaxScore2() {
        var nums = new int[] { 3, 4, 6, 8 };
        assertEquals(11, maxScoresSolution(nums));
    }

    @Test
    void testMaxScore3() {
        var nums = new int[] { 1, 2, 3, 4, 5, 6 };
        assertEquals(14, maxScoresSolution(nums));
    }

    @Test
    void testMaxScore4() {
        var nums = new int[] { 1, 2 };
        assertEquals(1, maxScoreCompact(nums));
    }


    @Test
    void testMaxScore5() {
        var nums = new int[] { 3, 4, 6, 8 };
        assertEquals(11, maxScoreCompact(nums));
    }

    @Test
    void testMaxScore6() {
        var nums = new int[] { 1, 2, 3, 4, 5, 6 };
        assertEquals(14, maxScoreCompact(nums));
    }

    @Test
    void testMaxScore7() {
        var nums = new int[] { 1, 2 };
        assertEquals(1, maxScoreRecursive(nums));
    }


    @Test
    void testMaxScore8() {
        var nums = new int[] { 3, 4, 6, 8 };
        assertEquals(11, maxScoreRecursive(nums));
    }

    @Test
    void testMaxScore9() {
        var nums = new int[] { 1, 2, 3, 4, 5, 6 };
        assertEquals(14, maxScoreRecursive(nums));
    }

    @Test
    void testMaxScore10() {
        var nums = new int[] { 1, 2 };
        assertEquals(1, maxScoreCompactSecond(nums));
    }


    @Test
    void testMaxScore11() {
        var nums = new int[] { 3, 4, 6, 8 };
        assertEquals(11, maxScoreCompactSecond(nums));
    }

    @Test
    void testMaxScore12() {
        var nums = new int[] { 1, 2, 3, 4, 5, 6 };
        assertEquals(14, maxScoreCompactSecond(nums));
    }

    @Test
    void testMaxScore13() {
        var nums = new int[] { 1, 2 };
        assertEquals(1, maxScoreBestRuntime(nums));
    }


    @Test
    void testMaxScore14() {
        var nums = new int[] { 3, 4, 6, 8 };
        assertEquals(11, maxScoreBestRuntime(nums));
    }

    @Test
    void testMaxScore15() {
        var nums = new int[] { 1, 2, 3, 4, 5, 6 };
        assertEquals(14, maxScoreBestRuntime(nums));
    }
}