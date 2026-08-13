package Arrays.Leetcode;

public class Problem2733 {

    public int findNonMinOrMax(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        return a + b + c - Math.min(a, Math.min(b, c))
                - Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Problem2733 solution = new Problem2733();

        int[] nums = {3, 2, 1, 4};

        int result = solution.findNonMinOrMax(nums);

        System.out.println(result);
    }
}