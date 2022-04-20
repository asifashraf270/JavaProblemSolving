package com.androiddevelopoer.Arrays;

public class RotateArray {
    public void leftRotate(int arr[],int d,int n)
    {

        for (int i=0;i<d;i++)
        {
            leftRotateByOne(arr,n);
        }
        printArray(arr);
    }
    public void leftRotateByOne(int arr[],int n)
    {
        int temp;
        temp=arr[0];
        for (int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    public void printArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println("Rotated:"+arr[i]);
        }
    }
}
