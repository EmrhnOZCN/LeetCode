class Solution {
    public String addBinary(String a, String b) {
       int maxLength = Math.max(a.length(), b.length());
        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int bit1 = i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int bit2 = i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            
            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
  
        
    }
}