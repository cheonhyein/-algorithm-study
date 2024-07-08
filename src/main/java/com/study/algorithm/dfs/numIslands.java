package com.study.algorithm.dfs;

/**
 * <pre>
 *
 *
 * Description : com.study.algorithm.dfs
 * </pre>
 *
 * @author
 * @since 2024. 7. 3.
 */


/**
 *
 * 문제 설명
 * 다음은 "섬의 개수 세기" 문제입니다. 주어진 2D 그리드에서 섬의 개수를 세는 문제입니다.
 * 여기서 섬은 물로 둘러싸인 땅의 집합을 의미하며, 상하좌우로 연결된 땅을 하나의 섬으로 간주합니다.
 * 그리드는 물('0')과 땅('1')으로 구성됩니다.
 *
 * 입력
 * 첫 번째 줄에 그리드의 행 개수𝑚 m과 열 개수𝑛 n이 주어집니다.
 * 다음𝑚 m개의 줄에 걸쳐 각 줄에 𝑛 n개의 문자가 주어집니다. 각 문자는 '0' 또는 '1'입니다.
 *
 * 예제
 * 4 5
 * 11110
 * 11010
 * 11000
 * 00000
 *
 * 출력 1

 */



public class numIslands {

    public static void main(String[] args) {
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(solution(grid1));

    }

    public static int solution(char[][] grid) {

        if(grid == null) {
            return 0;
        }

        int answer = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i< rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    answer++;
                    dfs(grid, visited, i, j);

                }
            }
        }
        return answer;
    }

    public static void dfs(char[][] grid, boolean[][] visited, int i, int j) {

        if(i < 0 || i >= grid.length || j < 0 || j>= grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true;

        dfs(grid, visited, i-1, j); // 상
        dfs(grid, visited, i+1, j); // 하
        dfs(grid, visited, i, j-1); // 좌
        dfs(grid, visited, i, j+1); // 우

    }
}
