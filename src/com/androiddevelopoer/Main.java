package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.MultiDimensionalArray;
import sun.rmi.runtime.Log;

public class Main {
    private static final String TAG = "Main";
    public static MultiDimensionalArray multiDimensionalArray;

    public static void main(String[] args) {
        // write your code here
        multiDimensionalArray=new MultiDimensionalArray();
        multiDimensionalArray.display2DArrayData();
        int[] sumArray={1,2,3,4};
        multiDimensionalArray.sum(sumArray);
        int[] returnedArray=multiDimensionalArray.returnArray();
        for (int i=0;i<returnedArray.length;i++)
        {
            System.out.println(TAG+returnedArray[i]);
        }
    }
}
