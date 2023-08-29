class Solution {
    public int lengthOfLongestSubstring(String s) {

         HashSet<Character> hashMap = new HashSet<>();
        int j = 0;
        int max = 0 ;
        for(int i = 0 ; i<s.length();i++){

            if(!hashMap.contains(s.charAt(i))){


                hashMap.add(s.charAt(i));

                max = Math.max(max, i-j + 1);
            }

            else {

                while (hashMap.contains(s.charAt(i))){

                    hashMap.remove(s.charAt(j));
                    j++;
                }

                hashMap.add(s.charAt(i));
            }

        }

        return max;
        
    }
}