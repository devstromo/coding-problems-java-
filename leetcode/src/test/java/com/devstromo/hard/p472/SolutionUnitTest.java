package com.devstromo.hard.p472;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Concatenated Words")
    void testConcatenatedWords() {
        Set<String> expected1 = new HashSet<>(List.of("catsdogcats", "dogcatsdog", "ratcatdogcat"));
        Set<String> actual1 = new HashSet<>(solution.findAllConcatenatedWordsInADict(new String[]{
                "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"
        }));
        assertEquals(expected1, actual1);

        Set<String> expected2 = new HashSet<>(List.of("catdog"));
        Set<String> actual2 = new HashSet<>(solution.findAllConcatenatedWordsInADict(new String[]{
                "cat", "dog", "catdog"
        }));
        assertEquals(expected2, actual2);
    }

    @Test
    @DisplayName("Test Concatenated Words Best")
    void testConcatenatedWordsBest() {
        Set<String> expected1 = new HashSet<>(List.of("catsdogcats", "dogcatsdog", "ratcatdogcat"));
        Set<String> actual1 = new HashSet<>(solution.findAllConcatenatedWordsInADictBest(new String[]{
                "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat"
        }));
        assertEquals(expected1, actual1);

        Set<String> expected2 = new HashSet<>(List.of("catdog"));
        Set<String> actual2 = new HashSet<>(solution.findAllConcatenatedWordsInADictBest(new String[]{
                "cat", "dog", "catdog"
        }));
        assertEquals(expected2, actual2);
    }

}