package com.devstromo.medium.p739;

import java.util.LinkedList;

public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        var answer = new int[temperatures.length];
        var stack = new LinkedList<Integer>();
        for (var currentDay = 0; currentDay < temperatures.length; currentDay++) {
            var currentTemperature = temperatures[currentDay];
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemperature) {
                var previousDay = stack.pop();
                answer[previousDay] = currentDay - previousDay;
            }
            stack.push(currentDay);
        }

        return answer;
    }
}
