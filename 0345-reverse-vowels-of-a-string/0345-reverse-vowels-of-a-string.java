class Solution {
    public String reverseVowels(String s) {


 StringBuilder sb = new StringBuilder(s);
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
        while (start < end && !isVowel(sb.charAt(start))) {
            start++;
        }

        while (start < end && !isVowel(sb.charAt(end))) {
            end--;
        }

        if (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    return sb.toString();
}
private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

private boolean isVowel(char c) {
    return vowels.contains(c);
}
}