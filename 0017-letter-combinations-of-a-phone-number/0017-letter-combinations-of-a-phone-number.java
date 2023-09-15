class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> resultList = new ArrayList<>();

        if (digits == null || digits.length() == 0) {
            return resultList;
        }

        String[] letters = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        generateCombinations(letters, digits, 0, "", resultList);

        return resultList;
    }

    private void generateCombinations(String[] letters, String digits, int currentIndex, String currentCombination, List<String> resultList) {
        if (currentIndex == digits.length()) {
            resultList.add(currentCombination);
            return;
        }

        int k = Character.getNumericValue(digits.charAt(currentIndex));

        if (k >= 2 && k <= 9) { // 2 ile 9 arasındaki rakamları kontrol edin
            String letterOptions = letters[k - 2]; // İlgili harfleri alın

            for (int j = 0; j < letterOptions.length(); j++) {
                char letter = letterOptions.charAt(j);
                generateCombinations(letters, digits, currentIndex + 1, currentCombination + letter, resultList);
            }
        }
    }
}