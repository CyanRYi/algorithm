package tech.sollabs.CountingElements;

public class MaxCounters {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, new int[]{1,6,2,6,3,6,4,6,5,6,1,6,2,6,3,6,4,6,5,6}));
        System.out.println(new Solution().solution(5, new int[]{3,2,2,4,2}));
    }

    public static class Solution {

        public int[] solution(int N, int[] A) {
            // write your code in Java SE 8

            int[] counter = new int[N];

            int totalMax = 0;
            int maxValue = 0;

            for (int a : A) {

                if (a == (N + 1)) {
                    totalMax = maxValue;
                } else {
                    counter[a-1] = Math.max(totalMax, counter[a-1]) + 1;
                    maxValue = Math.max(maxValue, counter[a-1]);
                }
            }

            for (int i = 0;i < N;i++) {
                counter[i] = Math.max(totalMax, counter[i]);
            }

            return counter;
        }
    }
}
