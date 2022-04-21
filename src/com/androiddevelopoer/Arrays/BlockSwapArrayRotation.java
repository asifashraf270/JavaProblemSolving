package com.androiddevelopoer.Arrays;

public class BlockSwapArrayRotation {



    public void leftRotateRec(int arr[],int i,int d,int n)
    {
        if(d==0 ||d==n)
        {
            return;

        }
        if(n-d==d)
        {
            swap(arr,i,n-d+i,d);
            return;
        }
        if(d<n-d)
        {
            swap(arr,i,n-d+i,d);
            leftRotateRec(arr,i,d,n-d);
        }else {
            swap(arr,i,d,n-d);
            leftRotateRec(arr,n-d+i,2*d-n,d);
        }

    }

    public void printArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public void swap(int[]arr ,int fi,int si,int d)
    {
        int temp;
        for (int i=0;i<d;i++)
        {
            temp=arr[fi+i];
            arr[fi+i]=arr[si+i];
            arr[si+i]=temp;
        }
    }
}
