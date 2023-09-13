class Solution {
     public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int n = prices.length;
        int[] dp = new int[n]; // dp[i], i. günün sonunda elde edilebilecek maksimum karı saklar
        int minPrice = prices[0]; // Şu ana kadar görülen en düşük fiyatı saklar

        for (int i = 1; i < n; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrice);
        }

        return dp[n - 1];
    }
}