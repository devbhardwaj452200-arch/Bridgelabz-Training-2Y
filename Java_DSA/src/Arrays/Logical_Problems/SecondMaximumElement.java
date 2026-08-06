package Arrays.Logical_Problems;

import java.util.Scanner;

public class SecondMaximumElement {

    public static int secondMaxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
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

        int secondMax = secondMaxElement(arr);

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second maximum element does not exist.");
        } else {
            System.out.println("Second maximum element: " + secondMax);
        }

        sc.close();
    }
}