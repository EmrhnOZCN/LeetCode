class Solution {
    public boolean isPalindrome(String s) {


        String newStr = s.replaceAll("[^a-zA-Z0-9]", "").replace(" ","").toLowerCase();






        StringBuilder stringBuilder = new StringBuilder(newStr);

        String reversStr = stringBuilder.reverse().toString();



        if(reversStr.equals(newStr)){

            return true;
        }

        return false;

    }
}