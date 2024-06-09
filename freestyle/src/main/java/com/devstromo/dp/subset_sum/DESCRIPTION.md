# Subset Sum Problem

## Introduction

The Subset Sum Problem is a classic problem in computer science and combinatorial optimization. It involves determining
if there is a subset of a given set of integers that sums up to a specific target value. This problem is a special case
of the Knapsack Problem and has applications in fields such as cryptography, resource allocation, and decision-making
processes.

## Problem Definition

Given a set of integers and a target sum, the Subset Sum Problem asks whether any subset of the given set sums up
exactly to the target sum.

### Formal Definition

- **Input**: A set of integers `S = {s1, s2, ..., sn}` and a target sum `T`.
- **Output**: A boolean value indicating whether there exists a subset `S'` such that the sum of the elements in `S'` is
  equal to `T`.

## Example

### Example 1

- **Input**: `S = {3, 34, 4, 12, 5, 2}`, `T = 9`
- **Output**: `True`
- **Explanation**: There is a subset `{4, 5}` that sums up to 9.

### Example 2

- **Input**: `S = {3, 34, 4, 12, 5, 2}`, `T = 30`
- **Output**: `False`
- **Explanation**: There is no subset that sums up to 30.

## Dynamic Programming Approach

Dynamic programming provides an efficient way to solve the Subset Sum Problem. The idea is to build a 2D table `dp`
where `dp[i][j]` indicates whether a subset of the first `i` elements has a sum equal to `j`.

### Algorithm

1. **Initialization**:
    - Create a 2D array `dp` of size `(n+1) x (T+1)`, where `n` is the number of elements in the set and `T` is the
      target sum.
    - Set `dp[0][0]` to `True` (a subset with sum 0 is always possible).

2. **Filling the dp Table**:
    - For each element `i` from 1 to `n`:
        - For each sum `j` from 0 to `T`:
            - If `j` is less than the current element `si`, set `dp[i][j]` to `dp[i-1][j]`.
            - Otherwise, set `dp[i][j]` to `dp[i-1][j]` or `dp[i-1][j-si]`.

3. **Result**:
    - The value of `dp[n][T]` will indicate whether a subset with sum equal to `T` exists.

## Applications

### 1. Cryptography

The Subset Sum Problem has applications in cryptography, particularly in the design of cryptographic algorithms and
schemes such as the Merkle-Hellman knapsack cryptosystem.

### 2. Resource Allocation

In resource allocation problems, the Subset Sum Problem can be used to determine the optimal allocation of resources to
achieve a specific target.

### 3. Decision-Making

In decision-making processes, the Subset Sum Problem helps in evaluating different options to achieve a desired outcome,
especially when dealing with financial and budgeting scenarios.

### 4. Combinatorial Problems

The problem serves as a foundation for solving various combinatorial problems and understanding the complexities
involved in subset-related queries.


