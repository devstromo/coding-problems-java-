# Catalan Numbers in Dynamic Programming

## Introduction

Catalan numbers are a sequence of natural numbers that have found application in various combinatorial mathematics problems, particularly in counting problems that involve recursive structures like trees, paths, and polygons. The sequence of Catalan numbers is one of the most ubiquitous sequences in combinatorics.

## Definition

The nth Catalan number can be defined in several ways, reflecting its various applications:

1. The number of correct bracket expressions that can be formed with n pairs of brackets.
2. The number of rooted full binary trees with n+1 leaves.
3. The number of ways to triangulate a polygon with n+2 sides.
4. The number of paths along the edges of a grid that do not cross above the diagonal.

## Formula

The nth Catalan number C_n is given by the formula:

C_n = (1 / (n + 1)) * (2n choose n) = (2n)! / ((n + 1)! * n!)

Alternatively, it can be expressed recursively as:

C_0 = 1
C_{n+1} = sum from i=0 to n of (C_i * C_{n-i})

## Dynamic Programming Approach

Dynamic programming can be used to calculate Catalan numbers efficiently. Here is how you can implement it:

### Algorithm

1. **Initialization**:
   - Let dp[0] = 1 as the base case.

2. **Filling the dp Array**:
   - For each i from 1 to n, calculate C_i using:
     C_i = sum from j=0 to i-1 of (dp[j] * dp[i-1-j])