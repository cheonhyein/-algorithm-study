package com.study.algorithm.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *
 *
 * Description : com.study.algorithm.dfs
 * </pre>
 *
 * @author
 * @since 2024. 7. 4.
 */

// 조합의 합 (Combination Sum)

public class FindCombinations {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        System.out.println(solution(candidates, target));
    }

    public static int[] solution(int[] candidates, int target) {
        List<List> answer = new ArrayList<>();
        Arrays.sort(candidates);

        if(candidates.length == 0 || target == 0) {
            return null;
        }

        dfs(candidates, target, answer);

        return  new int[]{1, 2};
    }

    public static List<List> dfs(int[] candidates, int target, List<List> answer) {

        for(int arg = 0; arg < candidates.length; arg++) {

            int candidate = candidates[arg];
            int sum = candidate;

//            dfs(candidates, target, answer, sum, arg);

        }
        return answer;
    }
}
