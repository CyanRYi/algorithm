package tech.sollabs.TimeComplexity;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 85, 30));
    }

    public static class Solution {

        public int solution(int X, int Y, int D) {
            // write your code in Java SE 8

            return (int) Math.ceil((double) (Y-X) / D);
        }
    }
}
