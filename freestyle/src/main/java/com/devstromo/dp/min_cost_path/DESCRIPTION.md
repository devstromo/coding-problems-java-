# Min Cost Path Algorithm

The Min Cost Path algorithm is used to find the minimum cost required to reach a destination cell `(m, n)` from a
starting cell `(0, 0)` in a grid, where each cell `(i, j)` in the grid has a cost associated with it. The objective is
to reach the destination while minimizing the total cost incurred.

## Problem Definition

Given a 2D grid where each cell represents the cost to traverse it, the task is to find the minimum cost path to reach
the bottom-right corner of the grid `(m, n)` from the top-left corner `(0, 0)`.

## Optimal Substructure

The problem exhibits the optimal substructure property, which means the optimal solution can be constructed efficiently
from optimal solutions of its subproblems. To reach cell `(m, n)`, one must come from one of the three adjacent cells:

1. Cell `(m-1, n-1)` (diagonally up-left)
2. Cell `(m-1, n)` (directly above)
3. Cell `(m, n-1)` (directly left)

Thus, the minimum cost to reach cell `(m, n)` can be expressed as the minimum cost to reach any of these three adjacent
cells plus the cost of the current cell.

## Algorithm Steps

To solve the problem, follow these steps:

1. **Base Cases**:
    - If the coordinates are out of bounds (negative indices), the cost is considered infinite (or a very large number).
    - If the starting point `(0, 0)` is reached, return the cost of that cell.

2. **Recursive Case**:
    - For each cell `(i, j)`, the cost to reach that cell is the cost of the current cell plus the minimum of the costs
      to reach the three adjacent cells.

### Recursive Approach

The recursive approach involves defining a function that computes the minimum cost to reach each cell by recursively
exploring the three possible paths from the adjacent cells. Base cases handle the edges of the grid and the starting
cell.

### Dynamic Programming Approach

Using dynamic programming, we can store the results of subproblems to avoid redundant calculations, which greatly
improves efficiency. The steps are as follows:

1. **Create a DP Table**: Initialize a 2D array where each entry represents the minimum cost to reach that cell.

2. **Initialize the DP Table**:
    - Set the cost of the starting cell.
    - Fill the first row and the first column based on the cumulative sum of costs, as there is only one path to reach
      each cell in the first row and column.

3. **Fill the DP Table**: For each cell in the table, compute the minimum cost using the cost of the current cell plus
   the minimum of the costs to reach the three adjacent cells.

## Conclusion

The Min Cost Path algorithm efficiently finds the minimum cost to traverse a grid using either a recursive approach with
optimal substructure or a dynamic programming approach that optimizes computation by storing intermediate results. The
dynamic programming solution is generally preferred due to its efficiency, avoiding the exponential time complexity of
the recursive method.
