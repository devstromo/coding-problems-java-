package com.devstromo.medium.p207;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            int course = pre[0], prereq = pre[1];
            graph.get(prereq).add(course); // Directed edge: prereq → course
            indegree[course]++; // Increase indegree for course
        }

        // Step 2: Initialize Queue with courses having 0 prerequisites
        Queue<Integer> queue = new LinkedList<>();
        int completedCourses = 0;

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        // Step 3: Process Courses (Topological Sort using BFS)
        while (!queue.isEmpty()) {
            int course = queue.poll();
            completedCourses++;

            for (int nextCourse : graph.get(course)) {
                indegree[nextCourse]--; // Reduce the prerequisite count
                if (indegree[nextCourse] == 0) {
                    queue.offer(nextCourse); // Add if all prerequisites are completed
                }
            }
        }

        return completedCourses == numCourses;
    }

    public boolean canFinishDFS(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] pre : prerequisites) {
            graph.get(pre[1]).add(pre[0]); // Directed edge: pre[1] → pre[0]
        }

        int[] visited = new int[numCourses]; // 0 = unvisited, 1 = visiting, 2 = visited

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, graph, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCycle(int node, List<List<Integer>> graph, int[] visited) {
        if (visited[node] == 1) return true; // Found a cycle
        if (visited[node] == 2) return false; // Already checked

        visited[node] = 1; // Mark as visiting
        for (int neighbor : graph.get(node)) {
            if (hasCycle(neighbor, graph, visited)) {
                return true;
            }
        }
        visited[node] = 2; // Mark as visited
        return false;
    }
}
