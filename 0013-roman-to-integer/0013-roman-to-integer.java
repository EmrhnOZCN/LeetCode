class Solution {
    private static final int[] VALUES = new int[26];

    static {
        VALUES['I' - 'A'] = 1;
        VALUES['V' - 'A'] = 5;
        VALUES['X' - 'A'] = 10;
        VALUES['L' - 'A'] = 50;
        VALUES['C' - 'A'] = 100;
        VALUES['D' - 'A'] = 500;
        VALUES['M' - 'A'] = 1000;
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int total = VALUES[chars[0] - 'A'];

        for (int i = 1; i < chars.length; i++) {
            if (VALUES[chars[i] - 'A'] > VALUES[chars[i - 1] - 'A']) {
                total += VALUES[chars[i] - 'A'] - 2 * VALUES[chars[i - 1] - 'A'];
            } else {
                total += VALUES[chars[i] - 'A'];
            }
        }

        return total;
    }
}
