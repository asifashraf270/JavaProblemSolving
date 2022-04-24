package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.*;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
       int[] arr={8,3,1,2};
       int n=arr.length;
       MaximumArraySum arraySum=new MaximumArraySum();
       System.out.println(arraySum.maxSumAmountRotation(arr));
    }

}
