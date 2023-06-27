package com.devstromo.kyu7.getNNode;

class Node {
    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws Exception {
        var position = 0;
        while (n != null) {
            if (position == index)
                return n.data;
            n = n.next;
            position++;
        }
        throw new Exception();
    }
}
