package com.devstromo.easy.p1221;

import static com.devstromo.easy.p1221.Solution.balancedStringSplit;
import static com.devstromo.easy.p1221.Solution.balancedStringSplitBestMemory;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testBalancedStringSplit() {
        assertEquals(4, balancedStringSplit("RLRRLLRLRL"));
    }

    @Test
    void testBalancedStringSplit2() {
        assertEquals(2, balancedStringSplit("RLRRRLLRLL"));
    }

    @Test
    void testBalancedStringSplit3() {
        assertEquals(1, balancedStringSplit("LLLLRRRR"));
    }

    @Test
    void testBalancedStringSplitBestMemory() {
        assertEquals(4, balancedStringSplitBestMemory("RLRRLLRLRL"));
    }

    @Test
    void testBalancedStringSplitBestMemory2() {
        assertEquals(2, balancedStringSplitBestMemory("RLRRRLLRLL"));
    }

    @Test
    void testBalancedStringSplitBestMemory3() {
        assertEquals(1, balancedStringSplitBestMemory("LLLLRRRR"));
    }
}