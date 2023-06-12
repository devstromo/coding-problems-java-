package com.devstromo.numbers.bigDecimalSort;

import static com.devstromo.numbers.bigDecimalSort.Solution.bigDecimalSort;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testBigDecimalSort() {
        assertArrayEquals(new String[] { "90", "56.6", "50", "02.34", "0.12", ".12", "0", "000.000", "-100", },
          bigDecimalSort(new String[] { "-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000", }));
    }

}