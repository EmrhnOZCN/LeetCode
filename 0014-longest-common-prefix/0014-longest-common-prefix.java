class Solution {
    public String longestCommonPrefix(String[] strs) {

        
        int count  = 0;

        Arrays.sort(strs);


        String start = strs[0];

        String end  = strs[strs.length-1];





        for(int i = 0 ; i<start.length();i++){


            if(start.charAt(i) == end.charAt(i)){

                count++;
            }
            else {
                break;
            }




        }




          


        return start.substring(0,count);
        

    }
}