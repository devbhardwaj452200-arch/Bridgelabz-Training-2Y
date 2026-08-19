package Strings.Leetcode;

public class Problem1455 {

        public static int isPrefixOfWord(String sentence, String searchWord) {
            String[] result = sentence.split(" ");

            for (int i = 0; i < result.length; i++) {
                if (result[i].startsWith(searchWord)) {
                    return i + 1;
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            String sentence = "i love eating burger";
            String searchWord = "burg";

            int answer = isPrefixOfWord(sentence, searchWord);

            System.out.println(answer);
        }
    }
