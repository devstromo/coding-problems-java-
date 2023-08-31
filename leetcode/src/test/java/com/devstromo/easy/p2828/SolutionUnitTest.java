package com.devstromo.easy.p2828;

import static com.devstromo.easy.p2828.Solution.isAcronym;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testIsAcronym() {
        assertTrue(isAcronym(List.of("alice", "bob", "charlie"), "abc"));
    }

    @Test
    void testIsAcronym2() {
        assertFalse(isAcronym(List.of("an", "apple"), "a"));
    }

    @Test
    void testIsAcronym3() {
        assertTrue(isAcronym(List.of("never", "gonna", "give", "up", "on", "you"), "ngguoy"));
    }
}