We can see that the number of 1's in the binary representation of i is related to the number of 1's in the binary representation of smaller numbers. Specifically, for any number i, the number of 1's is the same as the number of 1's in i/2, plus one if i is odd.

This is because dividing by 2 corresponds to right-shifting the bits of the number one place to the right, which doesn't change the number of 1's. If the number is odd, we have an additional 1 because the least significant bit of an odd number is 1.

Therefore, we can use this relationship to calculate the number of 1's for each number from 1 to n based on the numbers we have already calculated. This is a dynamic programming approach that allows us to solve the problem in O(n) time.