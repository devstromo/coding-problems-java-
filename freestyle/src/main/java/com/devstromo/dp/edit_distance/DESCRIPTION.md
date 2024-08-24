# Edit Distance Algorithm using Dynamic Programming

## Introduction

The Edit Distance algorithm, also known as Levenshtein Distance, measures the minimum number of operations required to
transform one string into another. The operations allowed are insertion, deletion, or substitution of a single
character.

## Dynamic Programming

Dynamic programming is a method for solving complex problems by breaking them down into simpler subproblems. It is used
when the problem can be divided into overlapping subproblems that can be solved independently.

## Edit Distance Algorithm

The Edit Distance between two strings `str1` and `str2` is computed using a 2D table where `dp[i][j]` represents the
edit distance between the first `i` characters of `str1` and the first `j` characters of `str2`.

### Steps:

1. **Initialization**:
    - If `i` is 0, `dp[i][j] = j` because we need `j` insertions to convert an empty string to `str2`.
    - If `j` is 0, `dp[i][j] = i` because we need `i` deletions to convert `str1` to an empty string.

2. **Filling the Table**:
    - If `str1[i-1] == str2[j-1]`, then `dp[i][j] = dp[i-1][j-1]` (no new operation needed).
    - If `str1[i-1] != str2[j-1]`, then `dp[i][j]` is the minimum of:
        - `dp[i-1][j] + 1` (deletion)
        - `dp[i][j-1] + 1` (insertion)
        - `dp[i-1][j-1] + 1` (substitution)

### Complexity Analysis

- **Time Complexity**: \(O(m imes n)\), where \(m\) and \(n\) are the lengths of `str1` and `str2`, respectively. This
  is because we are filling an \(m imes n\) table.
- **Space Complexity**: \(O(m imes n)\) for the table to store intermediate results.