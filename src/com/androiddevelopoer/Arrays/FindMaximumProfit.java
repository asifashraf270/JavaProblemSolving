package com.androiddevelopoer.Arrays;


public class FindMaximumProfit {
    public int findMaximumProfile(int[] stockPrice)
    {
        int minimumPrice=Integer.MAX_VALUE;
        int maxprofile=0;
        for (int i=0;i<stockPrice.length;i++)
        {
            maxprofile=Math.max(maxprofile,stockPrice[i]-minimumPrice);
            minimumPrice=Math.min(minimumPrice,stockPrice[i]);
        }
        return maxprofile;
    }

    public int findMaximumSellProfile(int length,int[] arr)
    {
        int currentBuy=arr[0];
        int globalSell=arr[1];
        int globalProfile=globalSell-currentBuy;
        int currentProfit;
        for (int i=0;i<length;i++)
        {
            int currentSell=arr[i];
            currentProfit=currentSell-currentBuy;
            if(currentProfit<globalProfile)
            {
                globalProfile=currentProfit;
                globalSell=arr[i];
            }
            if(currentBuy>arr[i])
            {
                currentBuy=arr[i];
            }

        }
        int optimalBuyPrice=globalSell-globalProfile;
        int optimalSellPrice=globalSell;
        return optimalSellPrice;

    }

}
