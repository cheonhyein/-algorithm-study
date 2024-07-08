package com.study.algorithm.dp;

/**
 * <pre>
 *
 *
 * Description : com.study.algorithm.dp
 * </pre>
 *
 * @author
 * @since 2024. 7. 7.
 */

// 배낭의 최대 value 찾기

public class KnapsackProblem {

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {10, 20, 30, 40, 50};
        int capacity = 7;

        int maxTotalValue = knapsack(weights, values, capacity);
        System.out.println("Maximum total value: " + maxTotalValue);
    }

    public static int knapsack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        // Build DP table
        for (int i = 1; i <= n; i++) {
            for (int w = 0; w <= capacity; w++) {
                if (weights[i - 1] <= w) {
                    dp[i][w] = Math.max(dp[i - 1][w], values[i - 1] + dp[i - 1][w - weights[i - 1]]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][capacity];
    }
}

