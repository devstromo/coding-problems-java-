package com.devstromo.day404;

import static java.util.Arrays.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Problem {
    public static int findMinimumRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        // Sort intervals by start time
        sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        // Use a priority queue to keep track of end times
        var endTimeQueue = new PriorityQueue<Integer>();

        // Add the end time of the first interval
        endTimeQueue.offer(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            // If the current interval's start time is greater than or equal to the earliest end time,
            // we can use the same room for this lecture, so remove the earliest end time from the queue.
            if (intervals[i][0] >= endTimeQueue.peek()) {
                endTimeQueue.poll();
            }

            // Add the current interval's end time to the queue
            endTimeQueue.offer(intervals[i][1]);
        }

        // The size of the priority queue represents the minimum number of rooms required
        return endTimeQueue.size();
    }
}
