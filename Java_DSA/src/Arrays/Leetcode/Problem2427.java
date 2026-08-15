package Arrays.Leetcode;

public class Problem2427 {

        public static int commonFactors(int a, int b) {
            int count = 0;
            int limit = Math.min(a, b);

            for (int i = 1; i <= limit; i++) {
                if (a % i == 0 && b % i == 0) {
                    count++;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            int a = 12;
            int b = 6;

            System.out.println(commonFactors(a, b));
        }
    }
