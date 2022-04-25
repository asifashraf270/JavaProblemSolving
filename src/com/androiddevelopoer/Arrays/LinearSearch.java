package com.androiddevelopoer.Arrays;

public class LinearSearch {
    //Linear Search
    public int countRotations(int[] arr,int n)
    {
        int min=arr[0],min_index=-1;
        for (int i=0;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
                min_index=i;
            }
        }
        return min_index;
    }

    //Binary Search

    public int binarySearch(int[] arr,int low,int high)
    {
        // This condition is needed to handle
        // the case when array is not rotated
        // at all
        if(high<low)
            return 0;
        // If there is only one element left
        if(high==low)return low;
        // Find mid
        // /*(low + high)/2;*/
        int mid=low+(high-low)/2;
        // Check if element (mid+1) is minimum
        // element. Consider the cases like
        // {3, 4, 5, 1, 2}

        if(mid<high&&arr[mid+1]<arr[mid])
            return (mid+1);


        if(mid>low && arr[mid]<arr[mid-1])
            return mid;
        // Decide whether we need to go to left
        // half or right half
        if(arr[high]>arr[mid])
            return binarySearch(arr,low,mid-1);
        return binarySearch(arr,mid+1,high);

    }

    public int iterativeMethodBinarySearch(int[] arr,int n)
    {
        int low=0;
        int high=n-1;
        while (low<=high)
        {
            int mid=low+(high-low)/2;
            int prev=(mid-1+n)%n;
            int next=(mid+1)%n;
            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next])
            {
                return mid;
            }
            else if(arr[mid]<=arr[high])
            high=mid-1;
            else if(arr[mid]>=arr[low])
            {
                low=mid+1;
            }
        }
        return 0;
    }


}
