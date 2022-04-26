package com.androiddevelopoer;

import com.androiddevelopoer.Arrays.*;
import jdk.nashorn.internal.ir.Block;

public class Main {
    private static final String TAG = "Main";

    public static void main(String[] args) {
      int [] arr={1,4,1};
      int n=arr.length;
      FindMaxHammingDistance distance=new FindMaxHammingDistance();
      System.out.println(distance.maxHamming(arr,n));
     }


}
