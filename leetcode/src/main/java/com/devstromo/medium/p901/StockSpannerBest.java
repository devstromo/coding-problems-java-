package com.devstromo.medium.p901;

public class StockSpannerBest {
    private Node top;

    public StockSpannerBest() {
        top = null;
    }

    public int next(int price) {
        Node nn;
        int span = 1;
        while (top != null && top.price <= price) {
            span += top.span;
            top = top.next;
        }
        nn = new Node(price, span);
        nn.next = top;
        top = nn;
        return top.span;
    }

    static class Node {
        int price;
        int span;
        Node next;

        Node(int price, int span) {
            this.price = price;
            this.span = span;
            this.next = null;
        }
    }
}
