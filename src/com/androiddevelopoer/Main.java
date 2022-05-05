package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.*;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
       int[] arr={1,2,5,5,5,5,5,5,5,20};
       LowHighIndex index=new LowHighIndex();
       index.findLowestHighestIndex(arr,5);


    }
}
