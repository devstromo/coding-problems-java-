package com.devstromo.medium.p24;

import static com.devstromo.medium.p24.Solution.swapPairs;
import static com.devstromo.medium.p24.Solution.swapPairsBestSolution;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSwapPairs() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        var expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));
        var cursorResult = swapPairs(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }


    @Test
    void testSwapPairs2() {
        var head = new ListNode(1);
        var expected = new ListNode(1);
        var cursorResult = swapPairs(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testSwapPairs3() {
        var head = new ListNode();
        var expected = new ListNode();
        var cursorResult = swapPairs(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testSwapPairs4() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3)));
        var expected = new ListNode(2, new ListNode(1, new ListNode(3)));
        var cursorResult = swapPairs(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testSwapPairsBestSolution() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        var expected = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));
        var cursorResult = swapPairsBestSolution(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }


    @Test
    void testSwapPairsBestSolution2() {
        var head = new ListNode(1);
        var expected = new ListNode(1);
        var cursorResult = swapPairsBestSolution(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testSwapPairsBestSolution3() {
        var head = new ListNode();
        var expected = new ListNode();
        var cursorResult = swapPairsBestSolution(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testSwapPairsBestSolution4() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3)));
        var expected = new ListNode(2, new ListNode(1, new ListNode(3)));
        var cursorResult = swapPairsBestSolution(head);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }
}