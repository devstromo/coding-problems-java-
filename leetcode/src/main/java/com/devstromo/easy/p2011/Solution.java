package com.devstromo.easy.p2011;

class Solution {
    public static int finalValueAfterOperations(String[] operations) {
        var result = 0;
        for (var operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                result++;
            } else {
                result--;
            }
        }
        return result;
    }
}
