class Solution {
   public boolean isPalindrome(String s) {

        if(s.isEmpty()){

            return true;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Character c:s.toCharArray()
             ) {

            if(Character.isLetterOrDigit(c)){
                stringBuilder.append(Character.toLowerCase(c));
            }



        }


        int left = 0;
        int right = stringBuilder.length() - 1;


        while (left<right){


            if(stringBuilder.charAt(left) != stringBuilder.charAt(right)) {



                return false;
            }

            left++;

            right--;

        }



        return true;

    }
}