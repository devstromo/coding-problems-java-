# Compute nCr % p using Dynamic Programming

## Introduction

Computing binomial coefficients is a common task in combinatorial mathematics. The binomial coefficient `nCr` represents
the number of ways to choose `r` elements from a set of `n` elements. When the values of `n` and `r` are large, directly
computing `nCr` can result in very large numbers. To handle such cases, we often compute `nCr % p`, where `p` is a prime
number. This helps in managing large numbers and preventing overflow. Dynamic programming provides an efficient way to
compute `nCr % p`.

## Definition

The binomial coefficient `nCr` is defined as:

- `nCr = n! / (r! * (n - r)!)`

Where `n!` denotes the factorial of `n`. To compute `nCr % p`, we need to find the remainder when `nCr` is divided by
`p`.

## Dynamic Programming Approach

Dynamic programming can be used to compute `nCr % p` efficiently. The idea is to build a 2D table `dp` where `dp[i][j]`
represents the value of `iCj % p`.

### Algorithm

1. **Initialization**:
    - Create a 2D array `dp` of size `(n+1) x (r+1)` and initialize all entries to `0`.
    - Set `dp[i][0] = 1` for all `0 <= i <= n` (base case: `iC0 = 1`).

2. **Filling the dp Table**:
    - For each `i` from 1 to `n`:
        - For each `j` from 0 to the minimum of `i` and `r`:
            - If `j` is 0 or `i` is equal to `j`, set `dp[i][j] = 1`.
            - Otherwise, compute `dp[i][j]` as:
              `dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % p`.

# Compute nCr % p using Dynamic Programming

## Introduction

Computing binomial coefficients is a common task in combinatorial mathematics. The binomial coefficient `nCr` represents
the number of ways to choose `r` elements from a set of `n` elements. When the values of `n` and `r` are large, directly
computing `nCr` can result in very large numbers. To handle such cases, we often compute `nCr % p`, where `p` is a prime
number. This helps in managing large numbers and preventing overflow. Dynamic programming provides an efficient way to
compute `nCr % p`.

## Definition

The binomial coefficient `nCr` is defined as:

- `nCr = n! / (r! * (n - r)!)`

Where `n!` denotes the factorial of `n`. To compute `nCr % p`, we need to find the remainder when `nCr` is divided by
`p`.

## Dynamic Programming Approach

Dynamic programming can be used to compute `nCr % p` efficiently. The idea is to build a 2D table `dp` where `dp[i][j]`
represents the value of `iCj % p`.

### Algorithm

1. **Initialization**:
    - Create a 2D array `dp` of size `(n+1) x (r+1)` and initialize all entries to `0`.
    - Set `dp[i][0] = 1` for all `0 <= i <= n` (base case: `iC0 = 1`).

2. **Filling the dp Table**:
    - For each `i` from 1 to `n`:
        - For each `j` from 0 to the minimum of `i` and `r`:
            - If `j` is 0 or `i` is equal to `j`, set `dp[i][j] = 1`.
            - Otherwise, compute `dp[i][j]` as:
              `dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % p`.
