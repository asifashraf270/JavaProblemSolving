package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.Arrays;
import com.androiddevelopoer.Arrays.RotateArray;

public class Main {
    private static final String TAG = "Main";
    public static RotateArray rotateArray;
    public static void main(String[] args) {
        // write your code here
        rotateArray=new RotateArray();
        int[] arr=new int[]{1,2,3,4,5,6,7};
        rotateArray.leftRotate(arr,2,7);

    }
}
