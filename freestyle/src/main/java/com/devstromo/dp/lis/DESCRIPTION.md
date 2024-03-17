# Longest Increasing Subsequence (LIS) 

Given an array arr[] of size N, the task is to find the length of the Longest Increasing Subsequence (LIS) i.e., the longest possible subsequence in which the elements of the subsequence are sorted in increasing order.

 ### Practice #1

Given a sequence of integers, find the length of its longest increasing subsequence. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements. An increasing subsequence means that every number is strictly greater than the previous number.

Input:

An array of integers, arr[1...n], where 1 ≤ n ≤ 1000
and −10<sup>4</sup> ≤ arr[i] ≤ 10<sup>4</sup> for each `i`.

Output:

A single integer representing the length of the longest increasing subsequence of the input array.
Example:

Input:

Copy code

10 22 9 33 21 50 41 60

Output:

5

### Practice #2

Description:
Given an unsorted array of integers, find the length of the longest increasing subsequence where the difference between consecutive elements in the subsequence is at least 2.

Input:

An array of integers, arr (1 ≤ |arr| ≤ 1000) where each integer (-10^6 ≤ arr[i] ≤ 10^6).
Output:

Return an integer representing the length of the longest increasing subsequence where the difference between consecutive elements is at least 2.
Example:

Input: arr = [1, 3, 7, 5, 10, 4, 15]

Output: 5

Explanation: The longest increasing subsequence with a difference of at least 2 between consecutive elements is [1, 3, 7, 10, 15].

Note:

In the example, even though [1, 3, 5, 10, 15] is also an increasing subsequence, the difference between 3 and 5 is just 2 which does not satisfy the given condition.

# Longest Strictly Decreasing Subsequence Problem

## Problem Statement

Given an array of integers, your task is to find the length of the longest strictly decreasing subsequence (LDS). A subsequence is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements. A strictly decreasing subsequence is one in which each element is strictly less than the previous element.

## Input

- An array of `n` integers, `nums`, where (1 ≤ `n` ≤ 3000) and (-10^9 ≤ `nums[i]` ≤ 10^9) for 0 ≤ `i` < `n`.

## Output

- An integer representing the length of the longest strictly decreasing subsequence in the array.

## Examples

### Example 1

**Input:** `nums = [9, 4, 3, 2, 5, 4, 3, 2]`

**Output:** `5`

Explanation: The longest strictly decreasing subsequence is `[9, 5, 4, 3, 2]`. It has a length of 5, which is the maximum possible length for a strictly decreasing subsequence in this array. This corrects the previous oversight and accurately represents the solution to the problem.

### Example 2

**Input:** `nums = [10, 22, 9, 33, 21, 50, 41, 60, 80]`

**Output:** `2`

**Explanation:** This sequence includes several decreasing subsequences of length 2, such as `[22, 9]`, `[33, 21]`, and others. There are no longer strictly decreasing subsequences in this array, making 2 the length of the longest possible strictly decreasing subsequence.

## Approach

The problem can be solved using a dynamic programming approach similar to the Longest Increasing Subsequence (LIS) problem. For each element in the array, you determine the length of the longest decreasing subsequence ending with that element. By comparing and updating these lengths throughout the array, you can find the overall longest strictly decreasing subsequence.