package com.devstromo.day386;

import java.util.HashMap;
import java.util.PriorityQueue;

class Problem {

    static String sortCharactersByFrequency(String input) {
        var frequencyMap = new HashMap<Character, Integer>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        var maxHeap = new PriorityQueue<Character>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));
        maxHeap.addAll(frequencyMap.keySet());

        StringBuilder result = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            char current = maxHeap.poll();
            result.append(String.valueOf(current)
              .repeat(Math.max(0, frequencyMap.get(current))));
        }
        return result.toString();
    }
}
