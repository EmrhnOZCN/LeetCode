class Solution {
    public String intToRoman(int num) {
       HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "I");
        hashMap.put(4, "IV");
        hashMap.put(5, "V");
        hashMap.put(9, "IX");
        hashMap.put(10, "X");
        hashMap.put(40, "XL");
        hashMap.put(50, "L");
        hashMap.put(90, "XC");
        hashMap.put(100, "C");
        hashMap.put(400, "CD");
        hashMap.put(500, "D");
        hashMap.put(900, "CM");
        hashMap.put(1000, "M");

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        StringBuilder sb = new StringBuilder();



        int i = 0;
        while (num > 0) {
            if (num >= values[i]) {

                System.out.println(hashMap.get(values[i]));
                sb.append(hashMap.get(values[i]));
                num -= values[i];
            } else {
                i++;
            }
        }

        return sb.toString();
    
    }

}