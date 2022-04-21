package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.*;
import jdk.nashorn.internal.ir.Block;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
        int n = arr.length-1;
        int key = 3;
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.searchingImprovedVersion(arr,0,arr.length-1, key);
        System.out.println("Result:" + result);
    }

}
