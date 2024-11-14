package com.devstromo.medium.p842;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        final var result = new ArrayList<Integer>();
        backtrack(num, 0, result);
        return result;
    }

    private boolean backtrack(String num, int index, List<Integer> sequence) {
        if (index == num.length() && sequence.size() >= 3) {
            return true;
        }

        for (int i = index; i < num.length(); i++) {
            if (num.charAt(index) == '0' && i > index) {
                break;
            }

            long currentNumber = Long.parseLong(num.substring(index, i + 1));

            if (currentNumber > Integer.MAX_VALUE) {
                break;
            }

            int size = sequence.size();

            if (size >= 2) {
                long sum = (long) sequence.get(size - 1) + sequence.get(size - 2);
                if (currentNumber > sum) {
                    break;
                }
                if (currentNumber < sum) {
                    continue;
                }
            }

            sequence.add((int) currentNumber);
            if (backtrack(num, i + 1, sequence)) {
                return true;
            }

            sequence.removeLast();
        }

        return false;
    }

    public List<Integer> splitIntoFibonacciBest(String num) {
        List<Integer> res = new ArrayList<>();
        helper(num, res, 0);
        return res;
    }

    private boolean helper(String s, List<Integer> res, int pos) {
        if (pos == s.length()) {
            return res.size() > 2;
        }
        long num = 0;
        for (int i = pos; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num > Integer.MAX_VALUE) {
                return false;
            }
            if (res.size() < 2 || res.getLast() + res.get(res.size() - 2) == num) {
                res.add((int) num);
                if (helper(s, res, i + 1)) {
                    return true;
                }
                res.removeLast();
            }
            if (i == pos && s.charAt(pos) == '0') {
                return false;
            }
        }
        return false;
    }
}
