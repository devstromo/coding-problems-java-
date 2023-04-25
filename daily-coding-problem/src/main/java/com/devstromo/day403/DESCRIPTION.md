This problem was asked by Two Sigma.

Using a function `rand5()` that returns an integer from 1 to 5 (inclusive) with uniform probability, implement a function rand7() that returns an integer from 1 to 7 `(inclusive)`.


## Resolution

The idea behind using the row and col variables is to create a mapping from the possible outcomes of two calls to `rand5()` to the desired outcomes of a call to `rand7()`. Since `rand5()` generates a random number from 1 to 5 (inclusive), there are 5x5=25 possible combinations of the two calls to `rand5()`.

Now, let's imagine a 5x5 grid (a two-dimensional array) representing these combinations, where each cell in the grid corresponds to a pair of rand5() outcomes. The row variable represents the row number (1 to 5), and the col variable represents the column number (1 to 5).

`(1,1) (1,2) (1,3) (1,4) (1,5)
(2,1) (2,2) (2,3) (2,4) (2,5)
(3,1) (3,2) (3,3) (3,4) (3,5)
(4,1) (4,2) (4,3) (4,4) (4,5)
(5,1) (5,2) (5,3) (5,4) (5,5)`

Now, we need to map these 25 combinations to 1-7 (inclusive) in a uniform way. Since 25 is not divisible by 7, we need to discard some combinations to achieve uniformity. To do this, we'll use the first 21 combinations (which is a multiple of 7) and discard the last 4.

To convert the `row` and `col` values to an index ranging from 1 to 25, we use the formula `(row - 1) * 5 + col`. This formula maps the 2D coordinates `(row, col`) to a 1D index. If the index is less than or equal to 21, we use it to generate a number between 1 and 7 using the modulo operation and return it. Otherwise, we continue looping until we get an index in the desired range.

This approach ensures that each number between 1 and 7 (inclusive) has an equal probability of being returned by the `rand7()` function, as each number has exactly three of the 21 valid combinations mapped to it (21 / 7 = 3).