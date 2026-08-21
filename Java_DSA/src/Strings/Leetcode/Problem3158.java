package Strings.Leetcode;

import java.util.*;

public class Problem3158 {

    public static int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int xor = 0;

        for (int key : map.keySet()) {
            if (map.get(key) == 2) {
                xor ^= key;
            }
        }

        return xor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(duplicateNumbersXOR(nums));

        sc.close();
    }
}
