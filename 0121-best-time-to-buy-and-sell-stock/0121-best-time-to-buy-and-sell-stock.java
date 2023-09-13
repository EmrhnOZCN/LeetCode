class Solution {
     public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0; // Maksimum karı saklayacak değişken
        int minPrice = prices[0]; // Şu ana kadar görülen en düşük fiyatı saklayacak değişken

        for (int i = 1; i < prices.length; i++) {
            int currentPrice = prices[i];
            // Şu ana kadar görülen en düşük fiyatı güncelle
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } else {
                // Şu ana kadar görülen en düşük fiyattan alıp bu fiyattan sattığımızda karı hesapla
                int profit = currentPrice - minPrice;
                // Eğer bu kar, daha önceki maksimum karı geçiyorsa güncelle
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}