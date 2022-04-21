package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.Arrays;
import com.androiddevelopoer.Arrays.BlockSwapArrayRotation;
import com.androiddevelopoer.Arrays.ReversalAlgoArrayRotation;
import com.androiddevelopoer.Arrays.RotateArray;
import jdk.nashorn.internal.ir.Block;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
        BlockSwapArrayRotation rotation=new BlockSwapArrayRotation();
        int [] arr=new int[]{1,2,3,4,5,6,7};
        rotation.leftRotateRec(arr,0,2,7);
        rotation.printArray(arr);
    }

}
