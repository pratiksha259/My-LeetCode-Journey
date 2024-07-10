class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int bp=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++)
        {
           if(bp<prices[i])
            {
                p=prices[i]-bp;
                maxp=Math.max(maxp,p);
            }
            else
             bp=prices[i];
        }
        return maxp;
    }
}