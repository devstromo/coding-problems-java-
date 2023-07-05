package com.devstromo.kyu7.Isograms;

import java.util.stream.Collectors;

class Isograms {

    public static boolean isIsogram(String str) {
        return str.toLowerCase()
          .chars()
          .filter(Character::isLetter)
          .boxed()
          .collect(Collectors.toSet())
          .size() == str.length();
    }
}
