package tech.sollabs.Arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public static void main(String[] args) {

    }

    public static class Solution {

        public int solution(int[] A) {
            // write your code in Java SE 8

            Set<Integer> singularElements = new HashSet<>();

            for (int a : A) {
                if (singularElements.contains(a)) {
                    singularElements.remove(a);
                } else {
                    singularElements.add(a);
                }
            }

            return singularElements.toArray(new Integer[]{})[0];
        }
    }
}
