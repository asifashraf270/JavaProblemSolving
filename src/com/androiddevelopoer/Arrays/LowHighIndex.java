package com.androiddevelopoer.Arrays;

public class LowHighIndex {

    public void findLowestHighestIndex(int[] arr,int key)
    {
        int lowestIndex=arr.length-1;
        int highestIndex=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                if(i<lowestIndex)
                {
                    lowestIndex=i;

                }
                if(i>highestIndex)
                {
                    highestIndex=i;
                }
            }
        }
        System.out.println(lowestIndex+"...."+highestIndex);
    }
}
