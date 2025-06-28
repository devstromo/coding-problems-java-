package com.devstromo.medium.p901;

import java.util.ArrayList;
import java.util.List;

class StockSpanner {
    private final List<Integer> list;

    public StockSpanner() {
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        list.add(price);
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) <= price) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
