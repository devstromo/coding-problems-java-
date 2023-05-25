# 837. New 21 Game

Alice plays the following game, loosely based on the card game "21".

Alice starts with 0 points and draws numbers while she has less than k points. During each draw, she gains an integer number of points randomly from the range [1, maxPts], where maxPts is an integer. Each draw is independent and the outcomes have equal probabilities.

Alice stops drawing numbers when she gets k or more points.

Return the probability that Alice has n or fewer points.

Answers within 10-5 of the actual answer are considered accepted.

Example 1:

Input: n = 10, k = 1, maxPts = 10

Output: 1.00000

Explanation: Alice gets a single card, then stops.

Example 2:

Input: n = 6, k = 1, maxPts = 10

Output: 0.60000

Explanation: Alice gets a single card, then stops.
In 6 out of 10 possibilities, she is at or below 6 points.

Example 3:

Input: n = 21, k = 17, maxPts = 10

Output: 0.73278


Constraints:

0 <= k <= n <= 10<sup>4</sup>
1 <= maxPts <= 10<sup>4</sup>


# Approach:

If the minimum target points K is 0 or the maximum total points N is greater than or equal to K + maxPts, it is guaranteed to win, so return 1.0.
Create a dp array of size N + 1 to store the probabilities.
Initialize all elements to 0.0, except dp[0] which is set to 1.0.
Initialize windowSum to 1.0 to keep track of the sum of the previous maxPts probabilities.
Initialize probability to 0.0 to store the final probability of winning.
Iterate from 1 to N and calculate the probabilities using dynamic programming:
Update dp[i] as windowSum / maxPts.
If i is less than K, add dp[i] to windowSum.
If i is greater than or equal to K, add dp[i] to probability.
If i - maxPts is greater than or equal to 0, subtract dp[i - maxPts] from windowSum.
Return probability as the result.

Intuition:

* We can think of the game as a series of draws, where at each draw we can draw any number from 1 to maxPts with equal probability.
* To calculate the probability of winning, we use dynamic programming to keep track of the probabilities for each point.
* Starting from point 0, we calculate the probabilities for each subsequent point up to N.
* At each point i, the probability of reaching that point is the sum of probabilities from the previous maxPts points divided by maxPts.
* If the current point i is less than K, we add the probability to the windowSum to keep track of the sum of previous probabilities.
* If the current point i is greater than or equal to K, we add the probability to the probability variable, which represents the final probability of winning.
* We maintain a sliding window of size maxPts to efficiently calculate the probabilities, removing the probability of the point that falls outside the window and adding the probability of the current point.
* Finally, we return the probability as the result, which represents the probability of winning the game.


