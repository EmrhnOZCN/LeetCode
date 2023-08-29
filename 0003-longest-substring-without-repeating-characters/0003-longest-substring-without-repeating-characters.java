class Solution {
     public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hashSet = new HashSet<>();

        int j = 0;
        int max = 0 ;

        for(int i = 0 ; i<s.length();i++){

            if(!hashSet.contains(s.charAt(i))){


                hashSet.add(s.charAt(i));

                max = Math.max(max, i-j + 1);
            }

            else {

                while (hashSet.contains(s.charAt(i))){

                    hashSet.remove(s.charAt(j));
                    j++;
                }

                hashSet.add(s.charAt(i));
            }

        }


        return max;
    }
}