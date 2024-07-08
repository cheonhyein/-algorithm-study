package com.study.algorithm.binarysearch;

/**
 * <pre>
 *
 *
 * Description : com.study.algorithm.binarysearch
 * </pre>
 *
 * @author
 * @since 2024. 7. 7.
 */

//https://velog.io/@a_ae_o/%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%EC%9D%B4%EB%B6%84%ED%83%90%EC%83%89-%EB%AC%B8%EC%A0%9C


public class one {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int target = 10;
        System.out.println(solution(arr, target));
    }

    public static int solution(int[] arr, int target) {

        int left = 0;
        int right = arr.length;

        while (left <= right) {

            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                return mid;
            }

            if(arr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }


        }

        return -1;
    }


}
