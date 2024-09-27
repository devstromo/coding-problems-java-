
### Maximum Size Square Sub-Matrix with All 1s

**Difficulty**: Medium

#### Description:

Given a binary matrix (a matrix containing only `0`s and `1`s), your task is to find the maximum size square sub-matrix with all `1`s. This means that you need to identify the largest square in the matrix that contains only `1`s.

#### Input:

1. `matrix`: A 2D list of integers representing the binary matrix, where each element is either `0` or `1`.
    - `1 <= rows, cols <= 1000`

#### Output:

Return an integer representing the size of the largest square sub-matrix with all `1`s (both length and width of the square).

#### Example 1:

**Input:**
```
matrix = [
  [0, 1, 1, 0, 1],
  [1, 1, 0, 1, 0],
  [0, 1, 1, 1, 0],
  [1, 1, 1, 1, 0],
  [1, 1, 1, 1, 1],
  [0, 0, 0, 0, 0]
]
```  
**Output:** `3`  
**Explanation:** The largest square sub-matrix with all 1s has a size of 3x3.

#### Example 2:

**Input:**
```
matrix = [
  [1, 1, 0, 1],
  [1, 1, 1, 0],
  [1, 1, 1, 1]
]
```  
**Output:** `2`  
**Explanation:** The largest square sub-matrix with all 1s has a size of 2x2.

#### Constraints:

- The input matrix will have dimensions `rows x cols`, where `1 <= rows, cols <= 1000`.
- Each element in the matrix will be either `0` or `1`.

#### Hints:

- Consider using a dynamic programming approach to solve this problem.
- You can use a 2D list to keep track of the size of the largest square sub-matrix ending at each cell.
- To compute the value for each cell, check its neighbors: top, left, and top-left diagonal.
