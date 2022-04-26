package com.androiddevelopoer.Arrays;

public class ReversalRightRotation {

    public void reverseArray(int[] arr,int start,int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public void rightRotate(int[] arr,int d,int n)
    {
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
    }
    public void printArray(int[] arr,int size)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
