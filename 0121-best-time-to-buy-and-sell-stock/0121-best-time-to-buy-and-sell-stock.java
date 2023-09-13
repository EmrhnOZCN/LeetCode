class Solution {
    	public int maxProfit(int[] prices) {
		int res=0;
		int[] dp = new int[prices.length];
		dp[0]=prices[0];
		for(int i=1; i<prices.length; i++){
			dp[i] = Math.min(dp[i-1], prices[i]);
		}
		for(int i=0; i<prices.length; i++){
			res = Math.max(res, prices[i]-dp[i]);
		}
		return res;
	}
}