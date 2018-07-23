package tech.sollabs.Iterations;

public class BinaryGap {

    public static void main(String[] args) {

    }

    public static class Solution {
        public int solution(int N) {
            // write your code in Java SE 8
            int gap = 0;

            int count = 0;
            for (char cha : Integer.toBinaryString(N).toCharArray()) {
                if (cha == '1') {
                    gap = Math.max(gap, count);
                    count = 0;
                } else {
                    count++;
                }
            }

            return gap;
        }
    }
}
