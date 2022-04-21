package com.androiddevelopoer.Arrays;

public class CyclicRotateArray {
    public void rotate(int[] arr)
    {
        int temp=arr[arr.length-1];
        for (int i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
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
