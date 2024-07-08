package com.study.algorithm.dp;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *
 *
 * Description : com.study.algorithm.dp
 * </pre>
 *
 * @author
 * @since 2024. 7. 5.
 */

// DP 피보나치수열

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }


    public static int solution(int n) {

        if(n == 0) return 0;
        if(n == 1) return 1;

        int[] list = new int[n+1];
        list[0] = 0;
        list[1] = 1;

        for(int i = 2; i < n+1; i++) {
            list[i] = list[i-2] + list[i-1];
        }

        return list[n];

//        List<Integer> list = new ArrayList<>();
//        list.add(0);
//        list.add(1);
//        while (true) {
//            int size = list.size();
//            if(list.size() == n + 1) {
//                return list.get(size-1);
//            }
//
//
//            int frt = list.get(size-2);
//            int sec = list.get(size-1);
//
//            list.add(frt + sec);
//        }

    }
}
