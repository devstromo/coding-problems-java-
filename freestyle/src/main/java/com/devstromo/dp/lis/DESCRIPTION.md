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