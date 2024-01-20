### Unbounded Knapsack Problem

**Difficulty**: Medium

#### Description:
In the Unbounded Knapsack Problem, you are given a knapsack with a maximum weight capacity `W` and a set of `n` items. Each item has a weight `wt[i]` and a value `val[i]`. Unlike the classic 0/1 Knapsack Problem, you can take an unlimited number of copies of each item. Your task is to determine the maximum value that you can carry in the knapsack without exceeding its weight limit.

#### Input:
1. `n` : An integer representing the number of items (`1 <= n <= 100`)
2. `W` : An integer representing the maximum weight capacity of the knapsack (`1 <= W <= 1000`)
3. `wt` : An array of integers where `wt[i]` is the weight of the `i-th` item (`1 <= wt[i] <= 100`)
4. `profits` : An array of integers where `val[i]` is the value of the `i-th` item (`1 <= val[i] <= 100`)

#### Output:
Return an integer representing the maximum total value you can achieve without exceeding the weight limit of the knapsack.

#### Example:
**Input:** `n = 3, W = 50, wt = [10, 20, 30], val = [60, 100, 120]`  
**Output:** `300`  
**Explanation:** The optimal way to fill the knapsack is by taking three items of weight 10 and value 60.

#### Constraints:
- You may take zero or more copies of each item.
- The total weight of the items should not exceed `W`.
- The input lists `wt` and `profits` are of equal length.

#### Hints:
- Consider using dynamic programming to solve this problem.
- Think about how you might break down the problem considering the unlimited availability of each item.


