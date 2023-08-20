package com.devstromo.medium.p74;

class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        var row = getRow(matrix, target);
        return row != null && find(row, target);
    }

    public static boolean searchMatrixBestMemory(int[][] matrix, int target) {
        var n = matrix.length;
        var m = matrix[0].length;
        var p1 = 0;
        var p2 = m - 1;
        while (p1 < n && p2 >= 0) {
            if (matrix[p1][p2] == target) {
                return true;
            } else if (matrix[p1][p2] < target) {
                p1++;
            } else {
                p2--;
            }
        }
        return false;
    }

    private static int[] getRow(int[][] matrix, int target) {
        var low = 0;
        var high = matrix.length - 1;
        while (low <= high) {
            var mid = low + (high - low) / 2;
            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else if (target > matrix[mid][matrix[0].length - 1]) {
                low = mid + 1;
            } else {
                return matrix[mid];
            }
        }
        return null;
    }

    private static boolean find(int[] nums, int target) {
        var low = 0;
        var high = nums.length;
        while (low <= high) {
            var mid = low + (high - low) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
