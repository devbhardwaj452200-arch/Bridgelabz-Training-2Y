package Practice.week1;

import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exponent = sc.nextInt();

        long result = 1;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }

            base *= base;
            exponent /= 2;
        }

        System.out.println(result);
    }
}
