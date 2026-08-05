package Arrays.Logical_Problems;

public class ReverseArray {

    public static void reverse(int[] arr) {
        int a = 0;
        int b = arr.length - 1;

        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);

        System.out.print("Reversed Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
