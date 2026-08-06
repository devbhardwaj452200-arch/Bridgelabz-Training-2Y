package Arrays.Logical_Problems;

import java.util.Scanner;

public class FirstRepeating {

    public static int firstRepeating(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1; // No repeating element
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = firstRepeating(arr);

        if (result == -1) {
            System.out.println("No repeating element found.");
        } else {
            System.out.println("First repeating element: " + result);
        }

        sc.close();
    }
}