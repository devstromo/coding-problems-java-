package com.devstromo.dp.coin_change;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeUnitTest {
    private final CoinChange coinChange = new CoinChange();

    @Test
    public void testCoinChangeBasic() {
        final var coins = new int[]{1, 2, 5};

        assertEquals(3, coinChange.solution(coins, 11));
        assertEquals(2, coinChange.solution(coins, 3));
    }

    @Test
    public void testCoinChangeEdgeCases() {
        final var coins1 = new int[]{1};
        final var coins2 = new int[]{2};

        assertEquals(0, coinChange.solution(coins1, 0));
        assertEquals(1, coinChange.solution(coins1, 1));
        assertEquals(-1, coinChange.solution(coins2, 3));
    }

    @Test
    public void testCoinChangeLargeInputs() {
        final var coins1 = new int[]{1, 2, 5, 10, 20, 50};
        final var coins2 = new int[]{1, 5, 10, 25, 50};

        assertEquals(2, coinChange.solution(coins1, 100));
        assertEquals(8, coinChange.solution(coins2, 99));
    }

    @Test
    public void testCoinChangeImpossibleCases() {
        final var coins = new int[]{2, 5, 10};

        assertEquals(-1, coinChange.solution(coins, 3));
    }

    @Test
    public void testCoinChangeAllCoinsLargerThanAmount() {
        final var coins = new int[]{5, 10, 25};

        assertEquals(-1, coinChange.solution(coins, 3));
    }


    @Test
    public void testCoinChangeBasic1D() {
        final var coins = new int[]{1, 2, 5};

        assertEquals(3, coinChange.solution1D(coins, 11));
        assertEquals(2, coinChange.solution1D(coins, 3));
    }

    @Test
    public void testCoinChangeEdgeCases1D() {
        final var coins1 = new int[]{1};
        final var coins2 = new int[]{2};

        assertEquals(0, coinChange.solution1D(coins1, 0));
        assertEquals(1, coinChange.solution1D(coins1, 1));
        assertEquals(-1, coinChange.solution1D(coins2, 3));
    }

    @Test
    public void testCoinChangeLargeInputs1D() {
        final var coins1 = new int[]{1, 2, 5, 10, 20, 50};
        final var coins2 = new int[]{1, 5, 10, 25, 50};

        assertEquals(2, coinChange.solution1D(coins1, 100));
        assertEquals(8, coinChange.solution1D(coins2, 99));
    }

    @Test
    public void testCoinChangeImpossibleCases1D() {
        final var coins = new int[]{2, 5, 10};

        assertEquals(-1, coinChange.solution1D(coins, 3));
    }

    @Test
    public void testCoinChangeAllCoinsLargerThanAmount1D() {
        final var coins = new int[]{5, 10, 25};

        assertEquals(-1, coinChange.solution1D(coins, 3));
    }

}