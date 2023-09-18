class Solution {
    public boolean isValid(String s) {
        char[] arr=new char[s.length()];
        int j=0;
        if(s.length()>1){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{'|| s.charAt(i)=='[' ){
                   arr[j]=s.charAt(i);
                   j++;
               }
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                if(j<1)
                    return false;
                if((arr[j-1]=='(' && s.charAt(i)==')') || (arr[j-1]=='[' && s.charAt(i)==']') || (arr[j-1]=='{' && s.charAt(i)=='}')){
                    j--;
                }else{
                    return false;
                }
            }
        }

        }else{
            return false;
        }
        return j==0;
    }
}