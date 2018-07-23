package tech.sollabs.TimeComplexity;

public class TapeEquilibrium {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(new int[]{-1000, 1000}));
        System.out.println(new Solution().solution(new int[]{-25, -17, -4, -35, -26}));
        System.out.println(new Solution().solution(new int[]{3, 1, 2, 4, 3}));
    }

    public static class Solution {

        public int solution(int[] A) {
            // write your code in Java SE 8

            long totalSum = 0;

            for (int a : A) {
                totalSum += a;
            }

            long sum = A[0];

            long minimumGapFromCenter = -1;
            for (int i = 1;i < A.length;i++) {

                long difference = Math.abs((totalSum - sum) - sum);
                sum += A[i];

                if (i == 1 || minimumGapFromCenter > difference) {
                    minimumGapFromCenter = difference;
                }
            }

            return (int) minimumGapFromCenter;
        }
    }
}
