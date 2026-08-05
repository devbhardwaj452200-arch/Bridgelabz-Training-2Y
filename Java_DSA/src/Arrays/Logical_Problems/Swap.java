package Arrays.Logical_Problems;

import java.util.Scanner;

public class Swap {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        swap(a, b);

        sc.close();
    }
}
