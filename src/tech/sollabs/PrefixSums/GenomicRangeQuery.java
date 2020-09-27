package tech.sollabs.PrefixSums;

import java.util.Arrays;

public class GenomicRangeQuery {

    public static void main(String[] args) {

        long startAt = System.currentTimeMillis();
        System.out.println(Arrays.toString(new Solution().solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
        System.out.println(System.currentTimeMillis() - startAt);
    }

    public static class Solution {

        public int[] solution(String S, int[] P, int[] Q) {

            final int M = P.length;

            int[] result = new int[M];

            for (int i = 0;i < M;i++) {

                String subStr = S.substring(P[i], Q[i]+1);

                if (subStr.contains("A")) {
                    result[i] = 1;
                } else if (subStr.contains("C")) {
                    result[i] = 2;
                } else if (subStr.contains("G")) {
                    result[i] = 3;
                } else if (subStr.contains("T")) {
                    result[i] = 4;
                }
            }

            return result;
        }
    }
}
