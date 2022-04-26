package com.androiddevelopoer.Arrays;

public class FindMaxHammingDistance {

    public int maxHamming(int[] arr,int n)
    {
        int brr[]=new int[2 *n + 1];
        for (int i = 0; i < n; i++)
            brr[i] = arr[i];
        for (int i = 0; i < n; i++)
            brr[n+i] = arr[i];

        // We know hamming distance with
        // 0 rotation would be 0.
        int maxHam = 0;
        for (int i = 1; i < n; i++)
        {
            int currHam = 0;
            for (int j = i, k=0; j < (i + n); j++,
                    k++)
                if (brr[j] != arr[k])
                    currHam++;

            // We can never get more than n.
            if (currHam == n)
                return n;

            maxHam = Math.max(maxHam, currHam);
        }
        return maxHam;
    }
}
