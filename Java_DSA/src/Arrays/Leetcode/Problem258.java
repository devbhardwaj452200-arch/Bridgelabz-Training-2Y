package Arrays.Leetcode;

public class Problem258 {

    public static int addDigits(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 9 == 0) ? 9 : num % 9;
    }

    public static void main(String[] args) {
        int num = 38;

        System.out.println(addDigits(num));
    }
}