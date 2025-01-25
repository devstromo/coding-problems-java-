package com.devstromo.medium.p210;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            graph.get(prereq[1]).add(prereq[0]);
            inDegree[prereq[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] order = new int[numCourses];
        int index = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            order[index++] = current;

            for (int neighbor : graph.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return index == numCourses ? order : new int[0];
    }

    private int top;

    public int[] findOrderBest(int numCourses, int[][] prerequisites) {
        top = numCourses - 1;

        int[] postList = new int[numCourses];
        int[] nextIndex = new int[prerequisites.length];
        int[] nextNode = new int[prerequisites.length];

        for (int i = 0; i < numCourses; i++) {
            postList[i] = -1;
        }

        int index = 0;
        for (int[] prerequisite : prerequisites) {
            nextIndex[index] = postList[prerequisite[1]];
            nextNode[index] = prerequisite[0];
            postList[prerequisite[1]] = index;
            index++;
        }

        int[] stack = new int[numCourses];
        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (0 == visited[i]) {
                if (!dfs(i, visited, postList, nextIndex, nextNode, stack)) {
                    return new int[0];
                }
            }
        }
        return stack;
    }

    private boolean dfs(int numCourses, int[] visited, int[] postList, int[] nextIndex, int[] nextNode, int[] stack) {
        visited[numCourses] = 1;
        for (int i = postList[numCourses]; i != -1; i = nextIndex[i]) {
            if (1 == visited[nextNode[i]]) {
                return false;
            }
            if (0 == visited[nextNode[i]]) {
                if (!dfs(nextNode[i], visited, postList, nextIndex, nextNode, stack)) {
                    return false;
                }
            }
        }
        visited[numCourses] = 2;
        stack[top] = numCourses;
        top--;
        return true;
    }
}
