package Strings.Leetcode;

import java.util.*;

public class Problem682 {

    public static int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {
            if (op.equals("+")) {
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top);
                stack.push(newScore);
            }
            else if (op.equals("D")) {
                stack.push(2 * stack.peek());
            }
            else if (op.equals("C")) {
                stack.pop();
            }
            else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] operations = new String[n];

        for (int i = 0; i < n; i++) {
            operations[i] = sc.next();
        }

        System.out.println(calPoints(operations));

        sc.close();
    }
}