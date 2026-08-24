package Strings.Leetcode;

public class Problem2109 {
        public static String addSpaces(String s, int[] spaces) {
            StringBuilder result = new StringBuilder();
            int i = 0;
            int j = 0;
            while (i < s.length()) {
                if (j < spaces.length && i == spaces[j]) {
                    result.append(" ");
                    j++;
                }
                result.append(s.charAt(i));
                i++;
            }
            return result.toString();
        }
        public static void main(String[] args) {
            String s = "LeetcodeHelpsMeLearn";
            int[] spaces = {8, 13, 15};
            String answer = addSpaces(s, spaces);
            System.out.println(answer);
        }
    }
