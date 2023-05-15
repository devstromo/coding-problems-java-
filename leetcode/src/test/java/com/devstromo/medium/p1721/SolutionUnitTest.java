package com.devstromo.medium.p1721;

import static com.devstromo.medium.p1721.Solution.swapNodes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testSwapNodes() {
        var head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        var expected = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));
        var result = swapNodes(head, 2);
        var cursorResult = result;
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }

    }

    @Test
    void testSwapNodes2() {
        var head = new ListNode(7, new ListNode(9,
          new ListNode(6, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5))))))))));
        var expected = new ListNode(7, new ListNode(9,
          new ListNode(6, new ListNode(6, new ListNode(8, new ListNode(7, new ListNode(3, new ListNode(0, new ListNode(9, new ListNode(5))))))))));
        var result = swapNodes(head, 5);
        var cursorResult = result;
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testSwapNodes3() {
        var head = new ListNode(1);
        var expected = new ListNode(1);
        var result = swapNodes(head, 1);
        var cursorResult = result;
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }
}