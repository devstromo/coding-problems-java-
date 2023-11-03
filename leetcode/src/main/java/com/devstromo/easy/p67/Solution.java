package com.devstromo.easy.p67;

public class Solution {
    public String addBinary(String a, String b) {
        var carry = 0;
        var p1 = a.length() - 1;
        var p2 = b.length() - 1;
        var result = new StringBuilder();
        while (p1 >= 0 || p2 >= 0 || carry != 0) {
            var bit1 = p1 >= 0 ? a.charAt(p1) - '0' : 0;
            var bit2 = p2 >= 0 ? b.charAt(p2) - '0' : 0;
            var sum = bit1 + bit2 + carry;
            result.append(sum % 2);
            carry = sum / 2;
            p1--;
            p2--;
        }
        return result.reverse().toString();
    }


}
