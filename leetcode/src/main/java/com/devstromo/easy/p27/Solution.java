package com.devstromo.easy.p27;

class Solution {
    public static int removeElement(int[] nums, int val) {
        var start = 0;
        var end = nums.length - 1;
        while (start <= end) {
            if (nums[end] == val) {
                end--;
            } else if (nums[start] == val) {
                var temp = nums[start];
                nums[start++] = nums[end];
                nums[end--] = temp;
            } else {
                start++;
            }
        }
        return end + 1;
    }
}
