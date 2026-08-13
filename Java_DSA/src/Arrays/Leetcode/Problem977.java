package Arrays.Leetcode;

import java.util.Arrays;

public class Problem977 {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[pos] = leftSquare;
                left++;
            } else {
                result[pos] = rightSquare;
                right--;
            }
            pos--;
        }

        return result;
    }

    public static void main(String[] args) {
        Problem977 solution = new Problem977();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = solution.sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}