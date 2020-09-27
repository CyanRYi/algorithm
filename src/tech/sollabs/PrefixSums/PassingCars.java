package tech.sollabs.PrefixSums;

public class PassingCars {

    public static void main(String[] args) {

    }

    public static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            int toWestCount = 0;
            int result = 0;

            for (int i = 0;i < A.length;i++) {

                if (A[i] == 1) {
                    result = result + i - toWestCount;
                    toWestCount++;

                    if (result > 1_000_000_000) {
                        return -1;
                    }
                }
            }

            return result;
        }
    }
}
