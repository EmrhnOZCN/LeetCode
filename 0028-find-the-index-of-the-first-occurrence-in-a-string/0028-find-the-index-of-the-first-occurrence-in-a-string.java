class Solution {
   public int strStr(String haystack, String needle) {

        int stop = 0 ;

        int j = 0;

        if(haystack.length()<needle.length()){

            return -1;
        }


        for(int i =0 ; i<haystack.length();i++){

            if(needle.charAt(j) == haystack.charAt(i)){

               j++;


            }

            else {
                i=i-j;
                j=0;

            }

            if(needle.length()==j){

                return i-j+1;
            }




        }
        
        return -1;
    }
}