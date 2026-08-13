package Arrays.Leetcode;

public class Problem13 {

    public int romanToInt(String s) {
        int[] roman = new int[128];

        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;

        int result = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (roman[s.charAt(i)] < roman[s.charAt(i + 1)]) {
                result -= roman[s.charAt(i)];
            } else {
                result += roman[s.charAt(i)];
            }
        }

        return result + roman[s.charAt(s.length() - 1)];
    }

    public static void main(String[] args) {
        Problem13 solution = new Problem13();

        String s = "MCMXCIV";

        int result = solution.romanToInt(s);

        System.out.println(result);
    }
}
