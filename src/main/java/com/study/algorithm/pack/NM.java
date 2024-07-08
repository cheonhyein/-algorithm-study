package com.study.algorithm.pack;

/**
 * <pre>
 *
 *
 * Description : com.study.algorithm
 * </pre>
 *
 * @author
 * @since 2024. 6. 21.
 */

public class NM {
    static int N = 4;
    static int M = 2;
    static boolean[] visited;
    static int[] arr;
    public static void main(String[] args) {
        visited = new boolean[N];
        arr = new int[M];
        dfs(N, M, 0);
    }


    public static void dfs(int N, int M, int depth) {
        if(depth == M) {
            for(int i : arr) {
                System.out.print(i);
            }
            System.out.println("/n");
            return;
        }

        for(int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[depth] = i+1;
                dfs(N, M, depth+1);
                visited[i] = false;
            }
        }
    }




}
