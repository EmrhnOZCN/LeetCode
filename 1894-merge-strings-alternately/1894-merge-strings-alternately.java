class Solution {
    public String mergeAlternately(String word1, String word2) {
          String output = "";
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            
            if ( i < word1.length() ) {
                output += word1.charAt(i);
            }

            if (i < word2.length()) {
                output += word2.charAt(i);
            }

            i++;

        }

        return output;
    }
}