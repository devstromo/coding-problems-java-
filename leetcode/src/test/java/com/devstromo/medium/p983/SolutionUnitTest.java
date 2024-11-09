package com.devstromo.medium.p983;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionUnitTest {
    private final Solution solution = new Solution();

    @Test
    public void testMinCostTicket() {
        assertEquals(11, solution.mincostTickets(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
        assertEquals(17, solution.mincostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}));
    }

    @Test
    public void testMinCostTicketBest() {
        assertEquals(11, solution.mincostTicketsBest(new int[]{1, 4, 6, 7, 8, 20}, new int[]{2, 7, 15}));
        assertEquals(17, solution.mincostTicketsBest(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}));
    }
}