# Minimum number of jumps to reach end (Jump Game)

## Problem Statement

Given an array `arr[]` where each element represents the maximum number of steps that can be made forward from that
index. The task is to find the minimum number of jumps to reach the end of the array starting from index 0.

## Examples

**Example 1:**

```
Input: arr = [2, 3, 1, 1, 4]
Output: 2
Explanation: The minimum number of jumps to reach the end is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
```

**Example 2:**

```
Input: arr = [1, 1, 1, 1, 1]
Output: 4
Explanation: The minimum number of jumps to reach the end is 4, by jumping 1 step at a time.
```

## Solution Approach

The problem can be approached using a greedy algorithm. The idea is to keep track of the farthest reachable index while
iterating through the array. At each step, update the range of the current jump, and if the end of the range is reached,
increase the jump count. Here’s a brief outline of the algorithm:

1. Initialize variables `jumps` (to count the number of jumps), `current_end` (to mark the end of the current jump
   range), and `farthest` (to track the farthest reachable index).
2. Iterate through the array up to the second last element.
3. Update the `farthest` reachable index.
4. If the current index reaches `current_end`, update `current_end` to `farthest` and increment the `jumps` count.
5. If `current_end` reaches or exceeds the last index, break the loop and return the number of jumps.

## Example Uses

**Use Case 1:**

Suppose you are developing a game where the player needs to jump across platforms to reach the end. The `arr` array can
represent the maximum distance the player can jump from each platform. Using the above algorithm, you can calculate the
minimum number of jumps needed for the player to complete the level.

**Use Case 2:**

In a networking scenario, each element in the `arr` array can represent the maximum range of each node in a network. To
determine the minimum number of hops required to reach the end node from the starting node, you can apply this
algorithm.
