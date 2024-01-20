### Maximum Value in a Knapsack

**Difficulty**: Medium

#### Description:
You're given `n` items, each with a distinct weight and value. You have a knapsack that can carry a maximum weight of `W`. Your task is to determine the maximum value you can carry in the knapsack without exceeding its weight limit. You can either take an entire item or leave it - no fractional items allowed.

#### Input:
1. `n` : An integer representing the number of items (`1 <= n <= 100`)
2. `W` : An integer representing the maximum weight capacity of the knapsack (`1 <= W <= 1000`)
3. `weights` : A list of integers where `weights[i]` is the weight of the `i`-th item (`1 <= weights[i] <= 100`)
4. `profits` : A list of integers where `values[i]` is the value of the `i`-th item (`1 <= values[i] <= 100`)

#### Output:
Return an integer representing the maximum total value you can achieve.

#### Example 1:
**Input:** `n = 3, W = 50, weights = [10, 20, 30], values = [60, 100, 120]`  
**Output:** `220`  
**Explanation:** The optimal way to fill the knapsack is to take items with weights 20 and 30.

#### Example 2:
**Input:** `n = 4, W = 5, weights = [3, 1, 2, 1], values = [2000, 1000, 1500, 500]`  
**Output:** `3500`  
**Explanation:** The optimal way to fill the knapsack is to take items with weights 3, and 2.

#### Constraints:
- Each item can be taken or left (0/1 property).
- The total weight should not exceed `W`.
- The input lists `weights` and `values` are of equal length.

#### Hints:
- Consider dynamic programming as a potential solution approach.
- Think about how you might break the problem down into smaller subproblems.
