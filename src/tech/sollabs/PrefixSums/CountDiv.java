package tech.sollabs.PrefixSums;

public class CountDiv {

    public static void main(String[] args) {

        System.out.println(new Solution().solution(1, 22, 3));      // 7
        System.out.println(new Solution().solution(6, 11, 2));      // 3
        System.out.println(new Solution().solution(-21, 0, 3));      // 8
        System.out.println(new Solution().solution(-21, -1, 3));      // 8
        System.out.println(new Solution().solution(0, 2_000_000_000, 1));      // 2000000001
    }

    public static class Solution {
        public int solution(int A, int B, int K) {
            // write your code in Java SE 8

            int result = (B / K) - (A / K);

            if (A % K == 0) {
                result++;
            }

            return result;
        }
    }
}
