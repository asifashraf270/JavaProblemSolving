package com.androiddevelopoer.Arrays;

public class swapSearching {
    public int search(int[] arr,int key)
    {
        int temp=arr.length-1;
        for (int i=0;i<temp;i++)
        {
            if(arr[i]==key)
            {
                return i;
            }
            else if(arr[temp]==key)
            {
                return temp;
            }
            temp--;
        }
        return temp;
    }
}
