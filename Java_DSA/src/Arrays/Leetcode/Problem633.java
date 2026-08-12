package Arrays.Leetcode;

public class Problem633 {

    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {
            long sum = left * left + right * right;

            if (sum == c) {
                return true;
            } else if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Problem633 obj = new Problem633();

        System.out.println(obj.judgeSquareSum(5));  // true
        System.out.println(obj.judgeSquareSum(3));  // false
    }
}
