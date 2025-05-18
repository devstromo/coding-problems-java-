# Longest Common Subsequence with One Swap

## Problem Statement

Given two strings `text1` and `text2`, return the length of the longest common subsequence (LCS) that can be formed by
performing **at most one swap** of any two characters in `text1`.

A subsequence of a string is a new string generated from the original string with some characters (possibly none)
deleted without changing the relative order of the remaining characters.

You may choose to either:

- Swap two different characters in `text1` exactly once, and then compute the LCS with `text2`, or
- Leave `text1` unchanged and compute the regular LCS.

Your goal is to find the **maximum** length of any LCS that can result from `text1` with at most one swap.

## Input

- A string `text1` of length `n` (`1 <= n <= 1000`)
- A string `text2` of length `m` (`1 <= m <= 1000`)

## Output

- An integer representing the maximum length of a longest common subsequence achievable from `text1` after at most one
  swap.

## Constraints

- `1 <= text1.length, text2.length <= 1000`
- `text1` and `text2` consist of lowercase English letters only.
