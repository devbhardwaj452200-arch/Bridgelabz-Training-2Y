package Arrays.Leetcode;

public class Problem3232 {

    public boolean canAliceWin(int[] nums) {
        int singleDigitSum = 0;
        int doubleDigitSum = 0;

        for (int num : nums) {
            if (num < 10) {
                singleDigitSum += num;
            } else {
                doubleDigitSum += num;
            }
        }

        return singleDigitSum != doubleDigitSum;
    }

    public static void main(String[] args) {
        Problem3232 solution = new Problem3232();

        int[] nums = {1, 2, 3, 4, 5, 14};

        boolean result = solution.canAliceWin(nums);

        System.out.println(result);
    }
}