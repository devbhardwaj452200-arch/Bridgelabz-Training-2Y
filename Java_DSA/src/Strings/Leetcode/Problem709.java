package Strings.Leetcode;

public class Problem709 {
        public static String toLowerCase(String s) {
            return s.toLowerCase();
        }

        public static void main(String[] args) {
            String s = "Hello WORLD";

            String result = toLowerCase(s);

            System.out.println("Original String: " + s);
            System.out.println("Lowercase String: " + result);
        }
    }
