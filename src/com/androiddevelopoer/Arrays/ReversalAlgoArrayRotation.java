package com.androiddevelopoer.Arrays;

public class ReversalAlgoArrayRotation {

    public void leftRotate(int arr[],int d)
    {
        if(d==0)return;
        int n=arr.length;

        d=d%n;
        System.out.println(d+"...value of D");
        reverseArray(arr,0,d-1);
        reverseArray(arr,d,n-1);
        reverseArray(arr,0,n-1);
        printArray(arr);
    }
    public void printArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");
        }
    }

    public void reverseArray(int[] array,int start,int end)
    {
        int temp;
        while (start<end)
        {
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }
}
