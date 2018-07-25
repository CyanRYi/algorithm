package tech.sollabs.CountingElements;

import java.util.HashSet;

public class PermCheck {

    public static void main(String[] args) {

    }

    public static class Solution {
        public int solution(int[] A) {
            // write your code in Java SE 8
            HashSet<Integer> intSet = new HashSet<>();
            for (int a : A) {

                if (a >= 1 && a <= A.length) {
                    intSet.add(a);
                }
            }

            if (intSet.size() != A.length) {
                return 0;
            }

            return 1;
        }
    }
}
