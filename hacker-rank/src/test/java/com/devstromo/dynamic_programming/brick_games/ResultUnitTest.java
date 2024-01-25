package com.devstromo.dynamic_programming.brick_games;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ResultUnitTest {

    @Test
    void testBrickGame() {
        var array = new int[]{999, 1, 1, 1, 0};
        assertEquals(1001, Result.bricksGame(array));
    }

    @Test
    void testBrickGame2() {
        var array = new int[]{0, 1, 1, 1, 999};
        assertEquals(999, Result.bricksGame(array));
    }

}