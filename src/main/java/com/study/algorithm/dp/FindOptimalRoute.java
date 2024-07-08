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


// 최적의 경로 찾기

public class FindOptimalRoute {

    public static void main(String[] args) {
        int[][] grid = {
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}
        };

        int n = 3;
        int m = 3;

        System.out.println(solution(n, m, grid));
    }

    public static int solution(int n, int m, int[][] grid) {
        for(int i = 0; i < n; i++){
            for(int j =0; j < m; j++) {
                // 위로 검사하기
                if(i == 0 && j == 0) {
                    continue;
                }


                if(i-1 < 0) {
                    grid[i][j] += grid[i][j-1];
                    continue;
                }
                if(j-1 < 0) {
                    grid[i][j] += grid[i-1][j];
                    continue;
                }

                int up = grid[i][j] + grid[i-1][j];
                int left = grid[i][j] + grid[i][j-1];

                grid[i][j] = Math.min(up, left);
            }
        }

        return grid[n-1][m-1];
    }
}
