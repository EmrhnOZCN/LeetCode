class Solution {
     public int lengthOfLongestSubstring(String s) {

         HashSet<Character> hashSet =new HashSet<>();

        int i = 0 ;

        int j = 0 ;

        int max = 0 ;

        while (j<s.length()){

            if(!hashSet.contains(s.charAt(j))){

                hashSet.add(s.charAt(j));

                max = Math.max(max,j-i+1);

                j++;
            }

            else {

                hashSet.remove(s.charAt(i));

                i++;

            }
            
        }


        return max;
    }
}