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

import java.util.LinkedList;
import java.util.Queue;

/**
 * 단어 검색 (Word Search)
 */

public class MazeSolution {


    public static void main(String[] args) {
        String word = "ABCCED";
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };


        System.out.println(solution(board, word));
    }

    public static boolean solution(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;
        char[] words = word.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        for(char c : words) {
            queue.add(c);
        }
        boolean[][] visited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(!visited[i][j]) {
                    if(dfs(board, queue, visited, i, j)){
                        return true;
                    };
                }
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, Queue queue, boolean[][] visited, int i, int j) {
        if(queue.isEmpty()) {
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || visited[i][j] || board[i][j] != (Character) queue.peek() ) {
            return false;
        }

        visited[i][j] = true;
        queue.poll();

        boolean isExist =
        dfs(board, queue, visited, i-1, j) ||
        dfs(board, queue, visited, i+1, j) ||
        dfs(board, queue, visited, i, j-1) ||
        dfs(board, queue, visited, i, j+1) ;

//        visited[i][j] = false;

        return isExist;
    }
}
