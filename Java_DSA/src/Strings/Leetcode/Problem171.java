package Strings.Leetcode;

public class Problem171 {

        public static int titleToNumber(String columnTitle) {
            int sum = 0;
            int p = 0;

            int n = columnTitle.length();

            for (int i = n - 1; i >= 0; i--) {
                int temp = columnTitle.charAt(i) - 'A' + 1;
                sum += (int) Math.pow(26, p++) * temp;
            }

            return sum;
        }

        public static void main(String[] args) {
            String columnTitle = "AB";

            int result = titleToNumber(columnTitle);

            System.out.println("Column Title: " + columnTitle);
            System.out.println("Column Number: " + result);
        }
    }
