class Solution {
    public int maxProfit(int[] prices) {
        // int by=prices[0];
        // int pr= 0;
        // for(int i =1;i<prices.length;i++){
        //     by=Math.min(by,prices[i]);
        //     pr=Math.max(pr,prices[i]-by);

        // }
        // return pr;

        int b=prices[0];
        int p=0;
        for(int i=0;i<prices.length;i++){
            b=Math.min(b,prices[i]);
            p=Math.max(p,prices[i]-b);
        }
        return p;
    }
}