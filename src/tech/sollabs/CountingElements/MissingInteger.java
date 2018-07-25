package tech.sollabs.CountingElements;

import java.util.HashSet;

public class MissingInteger {

    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {1, 3, 6, 4, 1, 2}));
    }

    public static class Solution {
        public int solution(int[] A) {

            HashSet<Integer> list = new HashSet<>();

            for (int a : A) {

                if (a <=0) {
                    continue;
                }

                list.add(a);
            }

            if (list.isEmpty()) {
                return 1;
            }

            for (int i = 1;i <= list.size();i++) {
                if (!list.contains(i)) {
                    return i;
                }
            }

            return list.size() + 1;
        }
    }
}
