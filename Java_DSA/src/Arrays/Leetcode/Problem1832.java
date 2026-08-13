package Arrays.Leetcode;

public class Problem1832 {

    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (char ch : sentence.toCharArray()) {
            seen[ch - 'a'] = true;
        }

        for (boolean letter : seen) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Problem1832 solution = new Problem1832();

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        boolean result = solution.checkIfPangram(sentence);

        System.out.println(result);
    }
}