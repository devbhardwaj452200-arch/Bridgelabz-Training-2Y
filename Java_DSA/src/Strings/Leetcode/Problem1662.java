package Strings.Leetcode;

public class Problem1662 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";

        for (String str : word1) {
            s1 += str;
        }

        for (String str : word2) {
            s2 += str;
        }

        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2)); // true

        String[] word3 = {"a", "cb"};
        String[] word4 = {"ab", "c"};

        System.out.println(arrayStringsAreEqual(word3, word4)); // false
    }
}