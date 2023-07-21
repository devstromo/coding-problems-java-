package com.devstromo.easy.p771;

import static com.devstromo.easy.p771.Solution.numJewelsInStones;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testNumJewelsInStones(){
        assertEquals(3, numJewelsInStones("aA", "aAAbbbb"));
    }

    @Test
    void testNumJewelsInStones2(){
        assertEquals(0, numJewelsInStones("z", "ZZ"));
    }

}