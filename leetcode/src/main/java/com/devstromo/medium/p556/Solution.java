package com.devstromo.medium.p556;

public class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }
        if (i < 0) {
            return -1;
        }
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }
        swap(digits, i, j);
        reverse(digits, i + 1, digits.length - 1);
        try {
            return Integer.parseInt(new String(digits));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
