package com.devstromo.kyu7.consonants;

class Consonants {
    public static int getCount(String str) {
        return (int) str.chars()
          .filter(Character::isAlphabetic)
          .filter(c -> "aeiou".indexOf((char) c) == -1)
          .count();
    }
}
