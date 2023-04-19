package com.devstromo.day401;

class Problem {
    static String[] applyPermutation(String[] arr, int[] permutation) {
        var result = new String[arr.length];
        for (var i = 0; i < arr.length; i++) {
            result[permutation[i]] = arr[i];
        }
        return result;
    }
}
