package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.*;
import jdk.nashorn.internal.ir.Block;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
        int arr1[] = { 5, 6, 1, 2, 3, 4 };
        FindMinimumRotatedArray rotatedArray = new FindMinimumRotatedArray();
        int length = arr1.length;
        System.out.println(rotatedArray.findMinInduplicate(arr1,0,length-1));
    }


}
