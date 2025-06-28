package com.devstromo.medium.p901;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockSpannerBestUnitTest {
    @Test
    @DisplayName("Test Online Stock Span")
    void testOnlineStockSpan() {
        final var stockSpanner = new StockSpannerBest();
        int result = stockSpanner.next(100); // return 1
        assertEquals(1, result);
        result = stockSpanner.next(80);  // return 1
        assertEquals(1, result);
        result = stockSpanner.next(60);  // return 1
        assertEquals(1, result);
        result = stockSpanner.next(70);  // return 2
        assertEquals(2, result);
        result = stockSpanner.next(60);  // return 1
        assertEquals(1, result);
        result = stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
        assertEquals(4, result);
        result = stockSpanner.next(85);  // return 6
        assertEquals(6, result);
    }
}