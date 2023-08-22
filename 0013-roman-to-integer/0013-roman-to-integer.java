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

    // Initialize the total to keep track of the final integer representation
    int total = 0;

    // Traverse the input string character by character
    for (int i = 0; i < s.length(); i++) {
        // Check if we need to subtract the current value
        if (i < s.length() - 1 && hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1))) {
            total -= hashMap.get(s.charAt(i));
        } else {
            // Otherwise, add the current value to the total
            total += hashMap.get(s.charAt(i));
        }
    }

    // Return the final integer representation of the given Roman numeral
    return total;
}

}
