package Arrays.Logical_Problems;

import java.util.ArrayList;

public class LearningArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println("ArrayList: " + list);

        System.out.println("We have converted ArrayList into Array");

        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
