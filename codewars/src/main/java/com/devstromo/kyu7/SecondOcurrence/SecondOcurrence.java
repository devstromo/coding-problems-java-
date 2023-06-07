package com.devstromo.kyu7.SecondOcurrence;

class SecondOcurrence {
    public static int secondSymbol(String str, char c) {
        if (!str.isEmpty()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                    if (count == 2) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
