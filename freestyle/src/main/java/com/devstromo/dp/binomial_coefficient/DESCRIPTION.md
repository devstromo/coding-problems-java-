# Binomial Coefficient with Dynamic Programming

## Introduction

The binomial coefficient, denoted as C(n, k) or "n choose k", represents the number of ways to choose k elements from a
set of n elements without regard to the order of selection. It is a fundamental concept in combinatorics and has
applications in probability theory, statistics, and various fields of mathematics and computer science.

The binomial coefficient is defined as:

C(n, k) = n! / (k! * (n - k)!)

However, calculating the factorials directly can lead to computational inefficiencies and overflow for large values of
n. Dynamic programming provides a more efficient approach.

## Dynamic Programming Approach

Dynamic programming is a method for solving problems by breaking them down into simpler subproblems and storing the
results of these subproblems to avoid redundant calculations. For computing the binomial coefficient, we can use a
dynamic programming table to store intermediate results.

### Steps to Compute Binomial Coefficient using Dynamic Programming

1. **Create a 2D array** `C` where `C[i][j]` will store the value of C(i, j).
2. **Initialize the base cases**:
    - C(i, 0) = 1 for all i because there is exactly one way to choose 0 elements from i elements (by choosing nothing).
    - C(i, i) = 1 for all i because there is exactly one way to choose i elements from i elements (by choosing all
      elements).
3. **Fill the rest of the table** using the recurrence relation:
   C(n, k) = C(n-1, k-1) + C(n-1, k)

This relation is derived from the fact that to form a combination of k elements from n elements, you can either include
the n-th element or exclude it.
