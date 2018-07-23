package tech.sollabs.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

    }

    public static class Solution {

        public int[] solution(int[] A, int K) {
            // write your code in Java SE 8

            if (A.length == 0) {
                return A;
            }

            int rotateCount = K % A.length;

            int[] result = new int[A.length];

            for (int i = 0;i < A.length;i++) {

                int targetIndex = (i + rotateCount) % A.length;
                result[targetIndex] = A[i];
            }

            return result;
        }
    }
}
