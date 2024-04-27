# Longest Common Subsequence (LCS)

## Introduction

The **Longest Common Subsequence (LCS)** problem is a classic computer science problem, often used to introduce the concept of dynamic programming. LCS is the problem of finding the longest subsequence present in two sequences (not necessarily contiguous) that can appear in the same relative order. This problem is useful in many applications, including bioinformatics, diff tools, and text comparison algorithms.

## Definition

A *subsequence* is a sequence derived from another sequence by deleting some elements without changing the order of the remaining elements. Given two sequences, finding the LCS means finding a subsequence that is common to both but is as long as possible.

For example:
- For the sequences `ABCBDAB` and `BDCABC`, the LCS is `BCAB`.

## Problem Statement

Given two sequences, find the length of the longest sequence which can be obtained from both the original sequences by deleting some items (possibly zero, but not necessarily contiguous).

## Dynamic Programming Approach

Dynamic programming is an approach to solve problems by breaking them down into simpler subproblems and storing the results of these subproblems to avoid computing the same results multiple times.

### Step-by-Step Solution

1. **Initialization:**
   Create a 2D array `dp` where `dp[i][j]` will hold the length of LCS of the first `i` characters of the first sequence and the first `j` characters of the second sequence. Initialize all elements of this array to 0.

2. **Filling the dp Array:**
    - If the characters from both sequences match (`sequence1[i-1] == sequence2[j-1]`), then `dp[i][j] = dp[i-1][j-1] + 1`.
    - If they do not match, take the maximum of ignoring the current character of either sequence:
      `dp[i][j] = max(dp[i-1][j], dp[i][j-1])`.

3. **Extract the LCS Length:**
   The length of the LCS can be found at `dp[length of sequence1][length of sequence2]`.

4. **Reconstructing the LCS:**
   To reconstruct the actual LCS string, backtrack from `dp[length of sequence1][length of sequence2]` by following the choices made:
    - Move diagonally up-left if characters matched.
    - Move left or up depending on which cell has the larger value when characters didn't match.

## Example

Consider the sequences `XMJYAUZ` and `MZJAWXU`. The dp array is filled as follows:

|   | - | M | Z | J | A | W | X | U |
|---|---|---|---|---|---|---|---|---|
| - | 0 | 0 | 0 | 0 | 0 | 0 | 0 | 0 |
| X | 0 | 0 | 0 | 0 | 0 | 0 | 1 | 1 |
| M | 0 | 1 | 1 | 1 | 1 | 1 | 1 | 1 |
| J | 0 | 1 | 1 | 2 | 2 | 2 | 2 | 2 |
| Y | 0 | 1 | 1 | 2 | 2 | 2 | 2 | 2 |
| A | 0 | 1 | 1 | 2 | 3 | 3 | 3 | 3 |
| U | 0 | 1 | 1 | 2 | 3 | 3 | 3 | 4 |
| Z | 0 | 1 | 2 | 2 | 3 | 3 | 3 | 4 |

The length of the LCS is `4`, and the LCS is `MJAU`.
