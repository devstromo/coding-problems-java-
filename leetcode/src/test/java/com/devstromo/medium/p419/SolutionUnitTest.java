package com.devstromo.medium.p419;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Test Battleships in a Board")
    void testBattleshipsInBoard() {
        assertEquals(2, solution.countBattleships(new char[][]{
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}
        }));

        assertEquals(0, solution.countBattleships(new char[][]{
                {'.'}
        }));
    }

    @Test
    @DisplayName("Test Battleships in a Board Best")
    void testBattleshipsInBoardBest() {
        assertEquals(2, solution.countBattleshipsBest(new char[][]{
                {'X', '.', '.', 'X'},
                {'.', '.', '.', 'X'},
                {'.', '.', '.', 'X'}
        }));

        assertEquals(0, solution.countBattleshipsBest(new char[][]{
                {'.'}
        }));
    }
}