package com.devstromo.medium.p2130;

import static com.devstromo.medium.p2130.Solution.pairSum;
import static com.devstromo.medium.p2130.Solution.pairSumRecursive;
import static com.devstromo.medium.p2130.Solution.pairSumTwoPointers;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testPairSum() {
        var head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
        assertEquals(6, pairSum(head));
    }

    @Test
    void testPairSum1() {
        var head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        assertEquals(7, pairSum(head));
    }

    @Test
    void testPairSum2() {
        var head = new ListNode(1, new ListNode(100_000));
        assertEquals(100001, pairSum(head));
    }

    @Test
    void testPairSum3() {
        var head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
        assertEquals(6, pairSumRecursive(head));
    }

    @Test
    void testPairSum4() {
        var head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        assertEquals(7, pairSumRecursive(head));
    }

    @Test
    void testPairSum5() {
        var head = new ListNode(1, new ListNode(100_000));
        assertEquals(100001, pairSumRecursive(head));
    }

    @Test
    void testPairSum6() {
        var head = new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(1))));
        assertEquals(6, pairSumTwoPointers(head));
    }

    @Test
    void testPairSum7() {
        var head = new ListNode(4, new ListNode(2, new ListNode(2, new ListNode(3))));
        assertEquals(7, pairSumTwoPointers(head));
    }

    @Test
    void testPairSum8() {
        var head = new ListNode(1, new ListNode(100_000));
        assertEquals(100001, pairSumTwoPointers(head));
    }
}