package tech.sollabs.TimeComplexity;

public class PermMissingElem {

    public static void main(String[] args) {

        int[] dum = new int[Integer.MAX_VALUE-1];

        for (int i = 2;i < Integer.MAX_VALUE;i++) {
            dum[i-2] = i;
        }
        System.out.println(new Solution().solution(dum));
    }

    public static class Solution {

        public int solution(int[] A) {
            // write your code in Java SE 8

            long maxValue = A.length+1;
            long expectedSum = (1 + maxValue) * maxValue / 2;
            long sum = 0;
            for (int a : A) {
                sum += a;
            }

            System.out.println(expectedSum);
            System.out.println(sum);
            System.out.println(expectedSum - sum);
            return (int) (expectedSum - sum);
        }
    }
}
