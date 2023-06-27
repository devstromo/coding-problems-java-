package com.devstromo.kyu7.getNNode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NodeUnitTest {
    @Test
    public void test2() {
        Node n = new Node();
        n.data = 1337;
        n.next = new Node();
        n.next.data = 42;
        n.next.next = new Node();
        n.next.next.data = 23;
        try {
            assertEquals(Node.getNth(n, 0), 1337);
            assertEquals(Node.getNth(n, 1), 42);
            assertEquals(Node.getNth(n, 2), 23);
        } catch (Exception e) {
            assertTrue(false);
        }
    }

    @Test
    public void testNull() {
        try {
            Node.getNth(null, 0);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testWrongIdx() {
        try {
            Node.getNth(new Node(), 1);
            assertTrue(false);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}