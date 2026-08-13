package Arrays.Leetcode;

public class Problem1108 {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        Problem1108 solution = new Problem1108();

        String address = "1.1.1.1";

        String result = solution.defangIPaddr(address);

        System.out.println(result);
    }
}