class Solution {
   public String gcdOfStrings(String str1, String str2) {
        String bigger = null;
        String smaller = null;

        if (str1.length() > str2.length()) {
            bigger = str1;
            smaller = str2;
        } else {
            bigger = str2;
            smaller = str1;
        }

        if (bigger.equals(smaller)) {
            return smaller;
        }
        if (!bigger.startsWith(smaller)) {
            return "";
        }
        return gcdOfStrings(bigger.substring(smaller.length()), smaller);
    }
       

        
       

  
}