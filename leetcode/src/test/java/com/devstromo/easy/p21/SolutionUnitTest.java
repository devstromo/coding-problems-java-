package com.devstromo.easy.p21;

import static com.devstromo.easy.p21.Solution.mergeTwoLists;
import static com.devstromo.easy.p21.Solution.mergeTwoListsWhile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class SolutionUnitTest {

    @Test
    void testMergeTwoLists() {
        var list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        var list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        var expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        var cursorResult = mergeTwoLists(list1, list2);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testMergeTwoLists2() {
        var list1 = new ListNode();
        var list2 = new ListNode();
        var expected = new ListNode();
        var cursorResult = mergeTwoLists(list1, list2);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testMergeTwoLists3() {
        var list1 = new ListNode();
        var list2 = new ListNode(0);
        var expected = new ListNode(0);
        var cursorResult = mergeTwoLists(list1, list2);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testMergeTwoListsWhile() {
        var list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        var list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        var expected = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));
        var cursorResult = mergeTwoListsWhile(list1, list2);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testMergeTwoListsWhile2() {
        var list1 = new ListNode();
        var list2 = new ListNode();
        var expected = new ListNode();
        var cursorResult = mergeTwoListsWhile(list1, list2);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }

    @Test
    void testMergeTwoListsWhile3() {
        var list1 = new ListNode();
        var list2 = new ListNode(0);
        var expected = new ListNode(0);
        var cursorResult = mergeTwoListsWhile(list1, list2);
        var cursorExpected = expected;
        while (cursorExpected != null) {
            assertNotNull(cursorResult);
            assertEquals(cursorExpected.val, cursorResult.val);
            cursorResult = cursorResult.next;
            cursorExpected = cursorExpected.next;
        }
    }
}