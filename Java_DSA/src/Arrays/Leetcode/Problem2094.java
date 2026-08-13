package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2094 {

    public int[] findEvenNumbers(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int[] count = new int[10];

        for (int digit : digits) {
            count[digit]++;
        }

        for (int num = 100; num <= 998; num += 2) {
            int[] temp = count.clone();

            int a = num / 100;
            int b = (num / 10) % 10;
            int c = num % 10;

            if (--temp[a] >= 0 &&
                    --temp[b] >= 0 &&
                    --temp[c] >= 0) {
                result.add(num);
            }
        }

        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        Problem2094 solution = new Problem2094();

        int[] digits = {2, 1, 3, 0};

        int[] result = solution.findEvenNumbers(digits);

        System.out.println(Arrays.toString(result));
    }
}
