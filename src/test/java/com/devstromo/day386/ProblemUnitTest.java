package com.devstromo.day386;

import static com.devstromo.day386.Problem.sortCharactersByFrequency;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ProblemUnitTest {
    @Test
    public void testSortCharactersByFrequency() {
        String input = "tweet";
        String output = sortCharactersByFrequency(input);
        assertTrue(isValidFrequencySort(input, output));

        input = "abcabc";
        output = sortCharactersByFrequency(input);
        assertTrue(isValidFrequencySort(input, output));

        input = "aabbcc";
        output = sortCharactersByFrequency(input);
        assertTrue(isValidFrequencySort(input, output));
    }

    private boolean isValidFrequencySort(String input, String output) {
        if (input.length() != output.length()) {
            return false;
        }

        int[] inputFrequency = new int[256];
        int[] outputFrequency = new int[256];

        for (char c : input.toCharArray()) {
            inputFrequency[c]++;
        }

        for (char c : output.toCharArray()) {
            outputFrequency[c]++;
        }

        for (int i = 0; i < 256; i++) {
            if (inputFrequency[i] != outputFrequency[i]) {
                return false;
            }
        }

        int previousFrequency = Integer.MAX_VALUE;
        for (int i = 0; i < output.length(); ) {
            char currentChar = output.charAt(i);
            int currentFrequency = outputFrequency[currentChar];
            if (previousFrequency < currentFrequency) {
                return false;
            }
            previousFrequency = currentFrequency;

            while (i < output.length() && output.charAt(i) == currentChar) {
                i++;
            }
        }
        return true;
    }
}