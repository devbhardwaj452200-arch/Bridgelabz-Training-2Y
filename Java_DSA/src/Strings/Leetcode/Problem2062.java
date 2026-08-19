package Strings.Leetcode;

public class Problem2062 {

        public static int countVowelSubstrings(String word) {
            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                int[] freq = new int[5];

                for (int j = i; j < word.length(); j++) {
                    char ch = word.charAt(j);

                    if ("aeiou".indexOf(ch) == -1) {
                        break;
                    }

                    if (ch == 'a') freq[0]++;
                    else if (ch == 'e') freq[1]++;
                    else if (ch == 'i') freq[2]++;
                    else if (ch == 'o') freq[3]++;
                    else if (ch == 'u') freq[4]++;

                    boolean allPresent = true;

                    for (int k = 0; k < 5; k++) {
                        if (freq[k] == 0) {
                            allPresent = false;
                            break;
                        }
                    }

                    if (allPresent) {
                        count++;
                    }
                }
            }

            return count;
        }

        public static void main(String[] args) {
            String word = "aeiouu";

            System.out.println(countVowelSubstrings(word));
        }
    }
