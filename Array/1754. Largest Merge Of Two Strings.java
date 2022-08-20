// Example 1:

// Input: word1 = "cabaa", word2 = "bcaaa"
// Output: "cbcabaaaaa"
// Explanation: One way to get the lexicographically largest merge is:
// - Take from word1: merge = "c", word1 = "abaa", word2 = "bcaaa"
// - Take from word2: merge = "cb", word1 = "abaa", word2 = "caaa"
// - Take from word2: merge = "cbc", word1 = "abaa", word2 = "aaa"
// - Take from word1: merge = "cbca", word1 = "baa", word2 = "aaa"
// - Take from word1: merge = "cbcab", word1 = "aa", word2 = "aaa"
// - Append the remaining 5 a's from word1 and word2 at the end of merge.
// Example 2:

// Input: word1 = "abcabc", word2 = "abdcaba"
// Output: "abdcabcabcaba"
  
  
  
  class Solution {

    public String largestMerge(String word1, String word2) {
        int i = 0, j = 0;

        StringBuilder sb = new StringBuilder();

        while (i < word1.length() && j < word2.length()) {
            if (word1.charAt(i) > word2.charAt(j)) {
                sb.append(word1.charAt(i++));
            } else if (word1.charAt(i) < word2.charAt(j)) {
                sb.append(word2.charAt(j++));
            } else {
              
              
                                 
                if (word1.substring(i, word1.length()).compareTo(word2.substring(j, word2.length())) > 0) {
                    sb.append(word1.charAt(i++));
                } else {
                  
                    sb.append(word2.charAt(j++));
                }
            }
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }

        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }
}
