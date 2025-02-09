package com.devstromo.hard.p127;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Word Ladder")
    void testWordLadder() {
        assertEquals(5, solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log", "cog")));
        assertEquals(0, solution.ladderLength("hit", "cog", List.of("hot", "dot", "dog", "lot", "log")));
    }

}