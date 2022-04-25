package com.androiddevelopoer.Arrays;

public class QuickLeftRotation {

    public void preprocess(int[] arr,int n,int temp[])
    {
        for (int i=0;i<n;i++)
        {
            temp[i]=temp[i+n]=arr[i];
        }
    }
    public void leftRoatate(int arr[],int n,int k,int temp[])
    {
        int start=k%n;
        for (int i=start;i<start+n;i++)
        {
            System.out.print(temp[i]+" ");
        }
        System.out.println("\n");
    }

    public void leftRotateSpace(int [] arr,int n,int k)
    {
        for (int i=k;i<k+n;i++)
        {
            System.out.println(arr[i%n]+" ");
        }
    }
}
