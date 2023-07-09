package com.devstromo.easy.p1108;

class Solution {
    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }
}
