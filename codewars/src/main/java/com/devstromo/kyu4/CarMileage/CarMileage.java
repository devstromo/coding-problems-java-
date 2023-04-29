package com.devstromo.kyu4.CarMileage;

import static java.lang.Integer.parseInt;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CarMileage {
    // for result
    public static boolean isReallyInteresting(int number, final int[] awesomePhrases) {
        return Stream.<Predicate<String>>of(s -> s.matches("\\d0+"), s -> new StringBuilder(s).reverse()
            .toString()
            .equals(s), "1234567890"::contains, "9876543210"::contains, s -> Arrays.stream(awesomePhrases)
            .anyMatch(n -> parseInt(s) == n))
          .anyMatch(p -> number > 99 && p.test(Integer.toString(number)));
    }

    public static int isInteresting(int number, int[] awesomePhrases) {
        for (var i = 0; i <= 2; i++) {
            int currentNumber = number + i;
            if (currentNumber < 100) {
                continue;
            }
            if (isInterestingNumber(currentNumber, awesomePhrases)) {
                return i == 0 ? 2 : 1;
            }
        }
        return 0;
    }

    private static boolean isInterestingNumber(int number, int[] awesomePhrases) {
        var numberStr = Integer.toString(number);
        return allZeros(numberStr) || sameDigits(numberStr) || sequentialIncrement(numberStr) || sequentialDecrement(numberStr) || palindrome(numberStr)
          || awesomePhrase(number, awesomePhrases);
    }

    private static boolean allZeros(String number) {
        return number.matches("\\d0+");
    }

    private static boolean sameDigits(String number) {
        return number.matches("(\\d)\\1+");
    }

    private static boolean sequentialIncrement(String number) {
        for (int i = 0; i < number.length() - 1; i++) {
            int current = number.charAt(i) - '0';
            int next = number.charAt(i + 1) - '0';
            if ((current == 9 && next != 0) || (current + 1) % 10 != next) {
                return false;
            }
        }
        return true;
    }

    private static boolean sequentialDecrement(String number) {
        for (var i = 0; i < number.length() - 1; i++) {
            var current = number.charAt(i);
            var next = number.charAt(i + 1);
            if ((current == '1' && next != '0') || current - 1 != next) {
                return false;
            }
        }
        return true;
    }

    private static boolean palindrome(String number) {
        return new StringBuilder(number).reverse()
          .toString()
          .equals(number);
    }

    private static boolean awesomePhrase(int number, int[] awesomePhrases) {
        for (var awesomePhrase : awesomePhrases) {
            if (number == awesomePhrase) {
                return true;
            }
        }
        return false;
    }
}
