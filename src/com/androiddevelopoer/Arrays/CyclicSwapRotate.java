package com.androiddevelopoer.Arrays;

public class CyclicSwapRotate {
    public void rotate(int[] arr)
    {
        int i=0,j=arr.length-1;
        while (i!=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
        }
        printArray(arr);
    }
    public void printArray(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
