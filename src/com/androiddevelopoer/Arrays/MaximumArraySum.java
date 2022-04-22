package com.androiddevelopoer.Arrays;

public class MaximumArraySum {

    public int maxSum(int[] arr)
    {
        int arrSum = 0;
        int currVal = 0;
        for (int i=0; i<arr.length; i++)
        {
            arrSum = arrSum + arr[i];
            currVal = currVal+(i*arr[i]);
        }


        int maxVal = currVal;


        for (int j=1; j<arr.length; j++)
        {
            currVal = currVal + arrSum-arr.length*arr[arr.length-j];
            if (currVal > maxVal)
                maxVal = currVal;
        }

        // Return result
        return maxVal;
    }

   public int maxSumAmountRotation(int [] arr)
   {
       int res=Integer.MIN_VALUE;
       for (int i=0;i<arr.length;i++)
       {
           int curr_sum=0;
           for (int j=0;j<arr.length;j++)
           {
               int index=(i+j)%arr.length;
               curr_sum+=j*arr[index];
           }
           res=Math.max(res,curr_sum);
       }
       return res;
   }




}
