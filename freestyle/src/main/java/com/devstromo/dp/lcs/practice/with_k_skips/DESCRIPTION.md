# Longest Common Subsequence with Skips

## Problem Statement

Given two strings `text1` and `text2`, and an integer `k`, return the length of the **longest common subsequence** you
can form **by skipping at most `k` characters in either string**. At any point, you may skip a character in `text1` or
`text2` (but not both at the same time), and you can do this up to `k` times total.

A subsequence of a string is a new string generated from the original string with some characters (possibly none)
deleted without changing the relative order of the remaining characters.

## Input

- A string `text1` of length `n` (`1 <= n <= 1000`)
- A string `text2` of length `m` (`1 <= m <= 1000`)
- An integer `k` (`0 <= k <= min(n, m)`)

## Output

- An integer representing the length of the longest common subsequence obtainable by skipping at most `k` characters in
  either `text1` or `text2`

## Example

### Input

`text1 = "abcde"`
`text2 = "acebd"`
`k = 1`

### Output
3

### Explanation

The standard LCS is `"acd"` (length 3).  
By skipping `'b'` from `text2`, we can align more characters and obtain the subsequence `"acd"` (length 3).

## Constraints

- `1 <= text1.length, text2.length <= 1000`
- `0 <= k <= min(text1.length, text2.length)`
- `text1` and `text2` consist of lowercase English letters only.
