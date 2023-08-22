class Solution {
    public int romanToInt(String s) {
        // Create a HashMap to store the values of Roman numerals
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        // Convert the input string to a character array for efficient traversal
        char[] chars = s.toCharArray();
        // Initialize the total with the value of the first Roman numeral
        int total = hashMap.get(chars[0]);

        // Iterate through the rest of the characters in the input string
        for (int i = 1; i < chars.length; i++) {
            // If the current Roman numeral is greater than the previous one
            if (hashMap.get(chars[i]) > hashMap.get(chars[i - 1])) {
                // Subtract twice the value of the previous numeral and add the current numeral's value
                total += hashMap.get(chars[i]) - 2 * hashMap.get(chars[i - 1]);
            } else {
                // Otherwise, simply add the value of the current numeral to the total
                total += hashMap.get(chars[i]);
            }
        }

        // Return the final total value
        return total;
    }
}
