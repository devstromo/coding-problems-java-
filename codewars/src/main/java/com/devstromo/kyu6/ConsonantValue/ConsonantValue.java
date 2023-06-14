package com.devstromo.kyu6.ConsonantValue;

import java.util.Set;
import java.util.stream.Stream;

class ConsonantValue {

    static Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

    public static int solve(final String s) {
        if (s.isEmpty())
            return 0;
        int[] values = new int[s.length()];
        int max = 0;
        if (vowels.contains(s.charAt(0)))
            values[0] = 0;
        else
            values[0] = s.charAt(0) - 'a' + 1;
        max = Math.max(max, values[0]);
        for (int i = 1; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i)))
                values[i] = 0;
            else
                values[i] = values[i - 1] + s.charAt(i) - 'a' + 1;
            max = Math.max(max, values[i]);
        }
        return max;
    }

    public static int solve2(final String s) {
        return Stream.of(s.split("[aeiou]"))
          .mapToInt(con -> con.chars()
            .map(c -> c - 96)
            .sum())
          .max()
          .orElse(0);
    }
}
