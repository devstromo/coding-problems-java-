package com.devstromo.medium.p739;

import java.util.LinkedList;
import java.util.Stack;

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

    public int[] dailyTemperaturesBest(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int day = stack.pop();
                res[day] = i - day;
            }
            stack.push(i);
        }
        res[temperatures.length - 1] = 0;
        return res;
    }
}
