package com.devstromo.day814;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class ProblemUnitTest {
    private final Problem problem = new Problem();

    @Test
    public void testSumTwoLinkedList() {
        final var list1 = new LinkedList<Integer>();
        list1.add(9);
        list1.add(9);
        final var list2 = new LinkedList<Integer>();
        list2.add(5);
        list2.add(2);
        assertEquals(124, problem.sumTwoLinkedList(list1, list2));
    }

    @Test
    public void testSumTwoLinkedListWithList2Null() {
        final var list1 = new LinkedList<Integer>();
        list1.add(9);
        list1.add(9);
        assertEquals(99, problem.sumTwoLinkedList(list1, null));
    }

    @Test
    public void testSumTwoLinkedListWithList1Null() {
        final var list2 = new LinkedList<Integer>();
        list2.add(5);
        list2.add(2);
        assertEquals(25, problem.sumTwoLinkedList(null, list2));
    }

}