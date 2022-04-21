package com.androiddevelopoer.Arrays;

public class BinarySearch {

    public int findPivot(int arr[],int low,int hight)
    {
        if(hight<low)
        {
            return -1;
        }
        if(hight==low)
            return low;
        int mid=(low+hight)/2;
        if(arr[mid]>arr[mid+1])
            return mid;
        if(arr[mid] <arr[mid-1])
            return (mid-1);
        if(arr[low]>=arr[mid])
        {
            return findPivot(arr,low,mid-1);
        }
        return findPivot(arr,mid+1,hight);
    }
    public int binarySearch(int arr[],int low,int high,int key)
    {
        if(high<low)
            return -1;
        int mid=(low+high)/2;
        if(key==arr[mid])
            return mid;
        if(key>arr[mid])
            return binarySearch(arr,(mid+1),high,key);
        return binarySearch(arr,low,(mid-1),key);
    }
    public int pivotedBinarsySearch(int arr[],int n,int key)
    {
        int pivot=findPivot(arr,0,n-1);
        if(pivot==-1)
            return binarySearch(arr,0,n-1,key);
        if(arr[pivot]==key)
            return pivot;
        if(arr[0]<=key)
            return binarySearch(arr,0,pivot-1,key);
        return binarySearch(arr,pivot+1,n-1,key);
    }

    public int searchingImprovedVersion(int[] arr,int l,int h,int key)
    {
        if (l > h)
            return -1;

        int mid = (l + h) / 2;
        if (arr[mid] == key)
            return mid;


        if (arr[l] <= arr[mid]) {

            if (key >= arr[l] && key <= arr[mid])
                return searchingImprovedVersion(arr, l, mid - 1, key);

            return searchingImprovedVersion(arr, mid + 1, h, key);
        }


        if (key >= arr[mid] && key <= arr[h])
            return searchingImprovedVersion(arr, mid + 1, h, key);

        return searchingImprovedVersion(arr, l, mid - 1, key);
    }
}
