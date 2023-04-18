package com.devstromo.day402;

class Problem {
    public static boolean isStrobogrammatic(String number) {
        int left = 0;
        int right = number.length() - 1;

        while (left <= right) {
            if (!isStrobogrammaticPair(number.charAt(left), number.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isStrobogrammaticPair(char a, char b) {
        return (a == '0' && b == '0') ||
          (a == '1' && b == '1') ||
          (a == '6' && b == '9') ||
          (a == '8' && b == '8') ||
          (a == '9' && b == '6');
    }
}
