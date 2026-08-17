package Leetcode;

public class Problem2414 {

        public static int longestContinuousSubstring(String s) {
            int maxLen = 1;
            int currentLen = 1;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) - s.charAt(i - 1) == 1) {
                    currentLen++;
                } else {
                    currentLen = 1;
                }

                maxLen = Math.max(maxLen, currentLen);
            }

            return maxLen;
        }

        public static void main(String[] args) {
            String s = "abacaba";

            System.out.println(longestContinuousSubstring(s));
        }
    }
