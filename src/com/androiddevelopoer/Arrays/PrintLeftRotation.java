package com.androiddevelopoer.Arrays;

public class PrintLeftRotation {
    public void leftRotate(int[] arr,int n,int k)
    {
        int mod=k%n;
        for (int i=0;i<n;i++)
        {
            System.out.print(arr[(i+mod)%n]+" ");
        }
        System.out.println();
    }

    public void printArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
