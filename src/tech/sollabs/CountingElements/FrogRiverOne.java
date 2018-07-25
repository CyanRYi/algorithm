package tech.sollabs.CountingElements;

import java.util.HashSet;

public class FrogRiverOne {

    public static void main(String[] args) {

    }

    public static class Solution {

        public int solution(int X, int[] A) {
            // write your code in Java SE 8

            HashSet<Integer> leaves = new HashSet<>(X);

            for (int i = 1;i <= X;i++) {
                leaves.add(i);
            }

            for (int i = 0;i < A.length;i++) {
                if (leaves.remove(A[i]) && leaves.isEmpty()) {
                    return i;
                }
            }

            return -1;
        }
    }
}
